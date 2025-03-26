package src.org.skypro.skyshop.basket;

import src.org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {
    private final Map<String, List<Product>> mapProducts = new HashMap<>();

    /**
     * Добавление продукта в корзину
     *
     * @param product
     */

    public void putProduct(Product product) {
        List<Product> listProduct = mapProducts.get(product.getName());
        if (listProduct == null) {
            listProduct = new LinkedList<>();
        }
        listProduct.add(product);
        mapProducts.put(product.getName(), listProduct);
    }


    /**
     * Получение общей стоимости корзины:
     *
     * @return
     */
    public int getTotalProductPrice() {
        int totalPrice = 0;
        for (List<Product> listProducts : this.mapProducts.values()) {
            for (Product product : listProducts) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }


    /**
     * Проверяет наличие продукта в корзине по имени
     *
     * @param productName
     * @return
     */
    public boolean isProduct(String productName) {
        return this.mapProducts.containsKey(productName);
    }


    /**
     * Очищает корзину
     */
    public void toClearBasket() {
        this.mapProducts.clear();
    }


    /**
     * Печатает содержимое корзины
     */
    public void toPrintBasket() {
        int countSpecialProduct = 0;
        int totalPrice = getTotalProductPrice();
        if (this.mapProducts.isEmpty()) {
            System.out.println("в корзине пусто");
            return;
        }
        for (List<Product> listProducts : this.mapProducts.values()) {
            for (Product product : listProducts) {
                if (product.isSpecial()) {
                    countSpecialProduct++;
                }
                System.out.println(product);
            }
        }
        System.out.printf("Итого: %d\n", totalPrice);
        System.out.printf("Специальных товаров: %d\n", countSpecialProduct);
    }

    /**
     * Возвращает корзину продуктов
     *
     * @return
     */
    public List<Product> getProducts() {
        List<Product> listProducts = new LinkedList<>();
        for (List<Product> list : mapProducts.values()) {
            listProducts.addAll(list);
        }
        return listProducts;
    }

    /**
     * Удаляет продукты из корзины с заданным именем.
     * Возвращает список удаленных продуктов
     *
     * @param productName
     * @return
     */
    public List<Product> removeFromBasket(String productName) {
        List<Product> listRemovedProducts = mapProducts.get(productName);
        if (listRemovedProducts == null) {
            return new LinkedList<>();
        }
        mapProducts.remove(productName);
        return listRemovedProducts;
    }

}
