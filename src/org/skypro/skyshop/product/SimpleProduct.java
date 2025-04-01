package org.skypro.skyshop.product;

/**
 * Обычные товары
 */
public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String productName, int price) {
        super(productName);
        if (price <= 0) {
            throw new IllegalArgumentException("Цена продукта '" + productName + "'должна быть больше 0!");
        }
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }


}
