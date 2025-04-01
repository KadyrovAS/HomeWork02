package cyclesFor;

public class Main {
    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
        ex08();
        ex09();
        ex10();
    }

    public static void ex01() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i ++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void ex02() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i --){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void ex03() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void ex04() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i --){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void ex05() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i += 4){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void ex06() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void ex07() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *=2){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void ex08() {
        int total = 0;
        int increaseAmount = 29000;

        System.out.println("Задача 8");
        for (int i = 1; i <= 12; i ++){
            total += increaseAmount;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    public static void ex09() {
        int total = 0;
        int increaseAmount = 29000;

        System.out.println("Задача 8");
        for (int i = 1; i <= 12; i ++){
            total += total / 100;
            total += increaseAmount;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    public static void ex10() {
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i ++){
            System.out.println("2*" + i + "=" + (2 * i));
        }
        System.out.println();
    }
}
