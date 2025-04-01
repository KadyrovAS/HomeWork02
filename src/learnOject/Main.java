package learnOject;

public class Main {
    public static void main(String[] args) {
        Author authorFirst = new Author("Лев", "Толстой");
        Author authorSecond = new Author("Фёдор", "Достоевский");

        Book bookFirst = new Book("Война и мир", authorFirst, 1865);
        Book bookSecond = new Book("Преступление и наказание", authorSecond, 1866);

        bookFirst.setPublicationYear(1924);

        System.out.println(bookFirst);
        System.out.println(bookSecond);
    }
}
