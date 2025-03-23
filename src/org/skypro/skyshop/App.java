package src.org.skypro.skyshop;

import src.org.skypro.skyshop.article.Article;
import src.org.skypro.skyshop.basket.ProductBasket;
import src.org.skypro.skyshop.exceptions.BestResultNotFound;
import src.org.skypro.skyshop.product.DiscountedProduct;
import src.org.skypro.skyshop.product.FixPriceProduct;
import src.org.skypro.skyshop.product.Product;
import src.org.skypro.skyshop.product.SimpleProduct;
import src.org.skypro.skyshop.search.SearchEngine;
import src.org.skypro.skyshop.search.Searchable;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        try {
            basket.putProduct(new FixPriceProduct("Хлеб"));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            basket.putProduct(new DiscountedProduct("Масло сливочное", 500, 110));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            basket.putProduct(new SimpleProduct("", 120));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            basket.putProduct(new SimpleProduct("Сахар", 50));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            basket.putProduct(new SimpleProduct("Соль", 0));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        SearchEngine searchEngine = new SearchEngine(10);
        for (
                Product product : basket.getProducts()) {
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

        for (
                Searchable value : searchEngine.search("Хлеб")) {
            if (value != null) {
                System.out.println(value);
            }
        }

        System.out.println();
        System.out.println("Демонстрация работы getSearchTerm и BestResultNotFound");
        try {
            Searchable findResult = searchEngine.getSearchTerm("Хлеб");
            findResult = searchEngine.getSearchTerm("Булка");
        } catch (BestResultNotFound e) {
            System.out.println(e);
        }
    }
}
