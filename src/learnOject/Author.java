package src.learnOject;

public class Author{
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

}
