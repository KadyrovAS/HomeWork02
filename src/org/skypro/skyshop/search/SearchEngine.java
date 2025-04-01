package org.skypro.skyshop.search;


import org.skypro.skyshop.exceptions.BestResultNotFound;

import java.util.*;
import java.util.stream.Collectors;

public class SearchEngine {

    List<Searchable> listSearches = new LinkedList<>();

    /**
     * Возвращает массив элементов, содержащих строку поиска
     *
     * @param search_line
     * @return
     */
    public Set<Searchable> search(String search_line) {
        Set<Searchable> searchableSet = this.listSearches.stream()
                .filter(x -> x.getSearchTerm().contains(search_line))
                .collect(Collectors.toSet());
        return searchableSet;
    }

    /**
     * Добавляет элемент в поисковый движок
     *
     * @param searchable
     */
    public void add(Searchable searchable) {
        this.listSearches.add(searchable);
    }

    /**
     * Возвращает элемент, у которого больше всего повторов строки поиска
     *
     * @param search
     * @return
     * @throws BestResultNotFound
     */
    public Searchable getSearchTerm(String search) throws BestResultNotFound {
        Searchable valueResult = null;
        int maxNumberOfRepetitions = 0;
        for (Searchable value : this.listSearches) {
            int count = 0;
            if (value == null) {
                continue;
            }
            int index = value.getSearchTerm().indexOf(search);
            while (index != -1) {
                count++;
                index += search.length();
                index = value.getSearchTerm().indexOf(search, index);
            }
            if (count > maxNumberOfRepetitions) {
                maxNumberOfRepetitions = count;
                valueResult = value;
            }
        }
        if (valueResult == null) {
            throw new BestResultNotFound(search);
        }
        return valueResult;
    }
}
