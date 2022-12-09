import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreadLocalUnitTests {

    @Test
    void testToAssertThreadLocalValue(){
        ThreadLocal<Integer> threadLocal = new ThreadLocal();
        threadLocal.set(10);
        assertEquals(10, threadLocal.get());
        threadLocal.remove();

    }
}
