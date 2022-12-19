package finalize;

public class Product implements AutoCloseable{

    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }


    @Override
    public void close() throws Exception {
        // perform any custom operation
    }

    public static void main(String[] args) throws Exception {
        try(Product product = new Product("Shirt")){

        }
    }
}
