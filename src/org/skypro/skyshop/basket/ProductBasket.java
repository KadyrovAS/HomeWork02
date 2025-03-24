package src.org.skypro.skyshop.basket;

import src.org.skypro.skyshop.product.Product;
import java.util.LinkedList;
import java.util.List;

public class ProductBasket{
    private List<Product> listProducts = new LinkedList<>();

    /**
     * Добавление продукта в корзину
     *
     * @param product
     */

    public void putProduct(Product product) {
        listProducts.add(product);
    }


    /**
     * Получение общей стоимости корзины:
     *
     * @return
     */
    public int getTotalProductPrice() {
        int totalPrice = 0;
        for (Product product : listProducts) {
            totalPrice += product.getPrice();
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
        for (Product product : listProducts) {
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
     * Очищает корзину
     */
    public void toClearBasket() {
        listProducts.clear();
    }


    /**
     * Печатает содержимое корзины
     */
    public void toPrintBasket() {
        int countSpecialProduct = 0;
        int totalPrice = getTotalProductPrice();
        if (listProducts.size() == 0) {
            System.out.println("в корзине пусто");
            return;
        }
        for (Product product : listProducts) {
            if (product.isSpecial()) {
                countSpecialProduct++;
            }
            System.out.println(product);
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
        return this.listProducts;
    }

    /**
     * Удаляет продукты из корзины с заданным именем
     * Возвращает список удаленных продуктов
     *
     * @param productName
     * @return
     */
    public List<Product> removeFromBasket(String productName) {
        List<Product> listRemovedProducts = new LinkedList<>();
        for (Product product : listProducts) {
            if (product.getProductName().equals(productName)) {
                listRemovedProducts.add(product);
            }
        }
        for (Product product : listRemovedProducts) {
            listProducts.remove(product);
        }
        return listRemovedProducts;
    }

}
