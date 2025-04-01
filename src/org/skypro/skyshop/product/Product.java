package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

import java.util.Objects;

public abstract class Product implements Searchable, Comparable<Searchable> {
    private String productName;

    public Product(String productName) {
        if (productName == null || productName.isBlank()) {
            throw new IllegalArgumentException("Не указано название продукта!");
        }
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial();

    @Override
    public String getSearchTerm() {
        return getName();
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productName);
    }

    @Override
    public int compareTo(Searchable o) {
        return 0;
    }
}
