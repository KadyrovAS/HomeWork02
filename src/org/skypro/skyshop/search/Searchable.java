package org.skypro.skyshop.search;

public interface Searchable {
    public String getSearchTerm();

    public String getContentType();

    public String getName();
    public default String getStringRepresentation() {
        return getSearchTerm() + " - " + getContentType();
    }
}
