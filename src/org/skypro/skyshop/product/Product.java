package src.org.skypro.skyshop.product;

import src.org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable{
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
}
