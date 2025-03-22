package src.org.skypro.skyshop.article;

import src.org.skypro.skyshop.search.Searchable;

public final class Article implements Searchable {
    private String name;
    private String text;

    public Article(String name, String text){
        this.name = name;
        this.text = text;
    }
    @Override
    public String toString() {
        return name + "\n" + text;
    }

    @Override
    public String getSearchTerm(){
        return toString();
    }

    @Override
    public String getContentType(){
        return "ARTICLE";
    }
}
