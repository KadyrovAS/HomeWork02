public class LearnString{
    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
    }

    public static void ex01(){
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName, middleName, lastName;
        String[] arFullName = fullName.split(" ");
        firstName = arFullName[0];
        middleName = arFullName[1];
        lastName = arFullName[2];

        System.out.println("Задача 1");
        System.out.println("Ф. И. О. сотрудника — " + firstName + " " + middleName + " " + lastName);
        System.out.println();
    }

    public static void ex02(){
        String fullName = "Ivanov Ivan Ivanovich";
        String upperFullName = fullName.toUpperCase();

        System.out.println("Задача 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperFullName);
        System.out.println();
    }

    public static void ex03(){
        String fullName = "Иванов Семён Семёнович";
        String simpleFullName = fullName.replace("ё", "е");

        System.out.println("Задача 3");
        System.out.println("Данные Ф. И. О. сотрудника — " + simpleFullName);
    }
}
