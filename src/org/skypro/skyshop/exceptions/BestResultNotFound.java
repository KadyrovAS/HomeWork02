package org.skypro.skyshop.exceptions;

public class BestResultNotFound extends Exception{
    private String searchLine;
    public BestResultNotFound(String searchLine){
        super(searchLine);
        this.searchLine = searchLine;
    }

    @Override
    public String toString() {
        return "BestResultNotFound{" +
                "для поисковой строки '" + searchLine + "' ничего не найдено}";
    }
}
