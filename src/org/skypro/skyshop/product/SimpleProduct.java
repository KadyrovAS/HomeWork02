package src.org.skypro.skyshop.product;

/**
 * Обычные товары
 */
public class SimpleProduct extends Product{
    private int price;

    public SimpleProduct(String productName, int price) {
        super(productName);
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
