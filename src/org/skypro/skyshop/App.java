package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.exceptions.BestResultNotFound;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        try {
            basket.putProduct(new FixPriceProduct("Хлеб"));
            basket.putProduct(new DiscountedProduct("Масло сливочное", 500, 10));
            basket.putProduct(new SimpleProduct("Молоко", 120));
            basket.putProduct(new SimpleProduct("Сахар", 50));
            basket.putProduct(new SimpleProduct("Соль", 30));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("Список продуктов в корзине:");
        basket.toPrintBasket();
        System.out.println();

        System.out.println("Удаляем продукт:");
        System.out.println(basket.removeFromBasket("Сахар"));
        System.out.println();

        System.out.println("Остались продукты в корзине:");
        basket.toPrintBasket();
        System.out.println();

        System.out.println("Удаляем несуществующий продукт:");
        if (basket.removeFromBasket("Водка").size() == 0) {
            System.out.println("Список удаленных продуктов пуст!");
        }
        System.out.println();

        System.out.println("Содержимое корзины:");
        basket.toPrintBasket();
        System.out.println();

        System.out.println("Содежимое корзины после удаления всех продуктов");
        basket.toClearBasket();
        basket.toPrintBasket();

        System.out.println("-".repeat(50));
        System.out.println("Тестирование SearchEngine");

        SearchEngine searchEngine = new SearchEngine();
        for (Product product : basket.getProducts()) {
            searchEngine.add(product);
        }

        searchEngine.add(new
                Article("О хлебе", "Хлеб в разном виде знают и любят во всем мире"));
        searchEngine.add(new
                Article("О яблоках", "Яблоки содержат воздух"));
        searchEngine.add(new
                Article("О шоколаде", "Шоколад может быть смертельно опасен для животных"));
        searchEngine.add(new
                Article("Чудесный картофель", "Картофель помог в создании первых фотографий"));
        searchEngine.add(new
                Article("О морковке", "В моркови больше сахара, чем в клубнике"));

        System.out.println("Поиск элементов, содержащих 'Хлеб'");
        for (Searchable value : searchEngine.search("Хлеб")) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println("Демонстрация работы getSearchTerm и BestResultNotFound");
        try {
            Searchable findResult = searchEngine.getSearchTerm("Хлеб");
            System.out.println(findResult);
            findResult = searchEngine.getSearchTerm("Булка");
            System.out.println(findResult);
        } catch (BestResultNotFound e) {
            System.err.println(e);
        }
    }
}
