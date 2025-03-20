package src.org.skypro.skyshop.basket;

import src.org.skypro.skyshop.product.Product;

public class ProductBasket{
    private Product[] arProducts;
    private final int arSize = 5;

    public ProductBasket() {
        this.arProducts = new Product[arSize];
    }

    /**
     * Добавление продукта в корзину
     *
     * @param product
     */
    public void putProduct(Product product) {
        for (int i = 0; i < arSize; i++) {
            if (arProducts[i] == null) {
                arProducts[i] = product;
                return;
            }
        }
        System.out.printf("Невозможно добавить продукт: %s\n", product.getProductName());
    }


    /**
     * Получение общей стоимости корзины:
     *
     * @return
     */
    public int getTotalProductPrice() {
        int totalPrice = 0;
        for (Product product : arProducts) {
            if (product == null) {
                continue;
            }
            totalPrice += product.getProductPrice();
        }
        return totalPrice;
    }


    /**
     * проверяет наличие продукта в корзине по имени
     *
     * @param productName
     * @return
     */
    public boolean isProduct(String productName) {
        for (Product product : arProducts) {
            if (product == null) {
                continue;
            }
            if (product.getProductName().equals(productName)) {
                return true;
            }
        }
        return false;
    }


    /**
     * очищает корзину
     */
    public void toClearBasket() {
        for (int i = 0; i < arSize; i++) {
            this.arProducts[i] = null;
        }
    }


    /**
     * печатает содержимое корзины
     */
    public void toPrintBasket() {
        int totalPrice = getTotalProductPrice();
        if (totalPrice == 0) {
            System.out.println("в корзине пусто");
            return;
        }
        for (Product product : arProducts) {
            if (product == null) {
                continue;
            }
            System.out.println(product);
        }
        System.out.printf("Итого: %d\n", totalPrice);
    }
}
