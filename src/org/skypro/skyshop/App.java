package src.org.skypro.skyshop;

import src.org.skypro.skyshop.basket.ProductBasket;
import src.org.skypro.skyshop.product.Product;

public class App{
    public static void main(String[] args) {
        String productName = "Хлеб";

        ProductBasket basket = new ProductBasket();
        basket.putProduct(new Product("Хлеб", 100));
        basket.putProduct(new Product("Масло сливочное", 500));
        basket.putProduct(new Product("Молоко", 120));
        basket.putProduct(new Product("Сахар", 50));
        basket.putProduct(new Product("Соль", 30));
        basket.putProduct(new Product("Водка", 1000));

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
