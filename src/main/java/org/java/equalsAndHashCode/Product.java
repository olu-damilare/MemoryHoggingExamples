package org.java.equalsAndHashCode;

import java.util.Objects;

public class Product {
    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Product product)) {
            return false;
        }
        return product.productName.equals(productName);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = productName != null ? 31 * hash + productName.hashCode() : hash;

        return hash;
    }
}
