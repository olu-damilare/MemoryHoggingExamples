import org.java.equalsAndHashCode.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class ProductUnitTests {

    @Test
    void testThatMemoryLeakThroughHashMapWhenHashCodeAndEqualsNotOverridden(){
        HashMap<Product, Long> map = new HashMap<>();
        for (long i = 0; i < 10; i++) {
            map.put(new Product("Shirt"), i);
        }

        Assertions.assertEquals(1, map.size());

    }
}
