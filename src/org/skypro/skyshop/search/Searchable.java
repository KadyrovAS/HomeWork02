package src.org.skypro.skyshop.search;

public interface Searchable {
    public String getSearchTerm();

    public String getContentType();

    public default String getStringRepresentation() {
        return getSearchTerm() + " - " + getContentType();
    }
}
