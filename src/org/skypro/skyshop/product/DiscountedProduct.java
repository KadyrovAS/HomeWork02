package src.org.skypro.skyshop.product;

/**
 * Товары с дисконтом
 */
public class DiscountedProduct extends Product {
    int price;
    int discount;

    public DiscountedProduct(String productName, int price, int discount) {
        super(productName);
        this.price = price;
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        return price - price * discount / 100;
    }

    @Override
    public String toString() {
        return getProductName() + " со скидкой: " + getPrice() + " (" + discount + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
