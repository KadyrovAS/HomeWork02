package src.org.skypro.skyshop.search;


import src.org.skypro.skyshop.exceptions.BestResultNotFound;

public class SearchEngine {
    private int arraySize;
    private Searchable[] searchables;


    public SearchEngine(int arraySize) {
        this.arraySize = arraySize;
        this.searchables = new Searchable[arraySize];
    }

    /**
     * Возвращает массив элементов, содержащих строку поиска
     *
     * @param search_line
     * @return
     */
    public Searchable[] search(String search_line) {
        Searchable[] arrSearchResult = new Searchable[5];
        int count = 0;
        for (Searchable valueSearchable : this.searchables) {
            if (valueSearchable == null) {
                continue;
            }
            if (valueSearchable.getSearchTerm().contains(search_line)) {
                arrSearchResult[count] = valueSearchable;
                count++;
                if (count == arrSearchResult.length) {
                    break;
                }
            }
        }
        return arrSearchResult;
    }

    /**
     * Добавляет элемент в поисковый движок
     *
     * @param searchable
     */
    public void add(Searchable searchable) {
        for (int i = 0; i < this.arraySize; i++) {
            if (this.searchables[i] == null) {
                searchables[i] = searchable;
                return;
            }
        }
    }

    public Searchable getSearchTerm(String search) throws BestResultNotFound {
        Searchable valueResult = null;
        int maxNumberOfRepetitions = 0;
        for (Searchable value : searchables) {
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
