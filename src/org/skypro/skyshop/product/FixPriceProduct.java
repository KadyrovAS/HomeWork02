package org.skypro.skyshop.product;

/**
 * Товары с фиксированной ценой
 */
public class FixPriceProduct extends Product {
    private final int fixPrice = 100;

    public FixPriceProduct(String productName) {
        super(productName);
    }

    @Override
    public int getPrice() {
        return this.fixPrice;
    }

    @Override
    public String toString() {
        return getName() + " с фиксированной ценой: Фиксированная цена " + getPrice();
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

}
