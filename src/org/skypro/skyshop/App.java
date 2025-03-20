package src.org.skypro.skyshop;

import src.org.skypro.skyshop.basket.ProductBasket;
import src.org.skypro.skyshop.product.DiscountedProduct;
import src.org.skypro.skyshop.product.FixPriceProduct;
import src.org.skypro.skyshop.product.SimpleProduct;

public class App{
    public static void main(String[] args) {
        String productName = "Хлеб";

        ProductBasket basket = new ProductBasket();
        basket.putProduct(new FixPriceProduct("Хлеб"));
        basket.putProduct(new DiscountedProduct("Масло сливочное", 500, 10));
        basket.putProduct(new SimpleProduct("Молоко", 120));
        basket.putProduct(new SimpleProduct("Сахар", 50));
        basket.putProduct(new SimpleProduct("Соль", 30));
        basket.putProduct(new SimpleProduct("Водка", 1000));

        System.out.println("-".repeat(50));
        basket.toPrintBasket();

        System.out.println("-".repeat(50));
        System.out.printf("Общая стоимость корзины: %s рублей\n", basket.getTotalProductPrice());

        System.out.println("-".repeat(50));
        if (basket.isProduct(productName)) {
            System.out.printf("Товар %s есть в корзине\n", productName);
        } else {
            System.out.printf("Товар %s в корзине отсутствует\n", productName);
        }

        System.out.println("-".repeat(50));
        productName = "Кефир";
        if (basket.isProduct(productName)) {
            System.out.printf("Товар %s есть в корзине\n", productName);
        } else {
            System.out.printf("Товар %s в корзине отсутствует\n", productName);
        }

        System.out.println("-".repeat(50));
        basket.toClearBasket();
        basket.toPrintBasket();

        System.out.println("-".repeat(50));
        System.out.printf("Общая стоимость корзины: %s рублей\n", basket.getTotalProductPrice());

        System.out.println("-".repeat(50));
        if (basket.isProduct(productName)) {
            System.out.printf("Товар %s есть в корзине\n", productName);
        } else {
            System.out.printf("Товар %s в корзине отсутствует\n", productName);
        }

    }
}
