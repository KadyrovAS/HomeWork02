package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;
import java.util.stream.Collectors;

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
        return mapProducts.values().
                stream().
                flatMap(Collection::stream)
                .mapToInt(Product::getPrice)
                .sum();
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
        Optional.ofNullable(mapProducts)
                .filter(map -> !map.isEmpty())
                .ifPresentOrElse(
                        map -> map.values()
                                .stream()
                                .flatMap(List::stream)
                                .forEach(System.out::println),
                        () -> System.out.println("в корзине пусто")
                );

        System.out.printf("Итого: %d\n", getTotalProductPrice());
        System.out.printf("Специальных товаров: %d\n", getSpecialCount());
    }

    private int getSpecialCount() {
        return (int) this.mapProducts.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(x -> x.isSpecial())
                .count();
    }


    /**
     * Возвращает корзину продуктов
     *
     * @return
     */
    public List<Product> getProducts() {
        return Optional
                .ofNullable(mapProducts)
                .map(Map::values)
                .orElse(Collections.emptyList())
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    /**
     * Удаляет продукты из корзины с заданным именем.
     * Возвращает список удаленных продуктов
     *
     * @param productName
     * @return
     */
    public List<Product> removeFromBasket(String productName) {
        return Optional.ofNullable(mapProducts.get(productName))
                .map(products -> {
                    mapProducts.remove(productName);
                    return products;
                })
                .orElseGet(LinkedList::new);
    }

}
