package src.org.skypro.skyshop.search;


public class SearchEngine {
    private final int maxSearch = 5;
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
        Searchable[] arrSearchResult = new Searchable[maxSearch];
        int count = 0;
        for (Searchable valueSearchable : this.searchables) {
            if (valueSearchable == null) {
                continue;
            }
            if (valueSearchable.getSearchTerm().contains(search_line)) {
                arrSearchResult[count] = valueSearchable;
                count++;
                if (count == maxSearch) {
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

}
