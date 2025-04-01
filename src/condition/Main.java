package condition;

public class Main {
    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
    }

    public static void ex01() {
        int age = 17;
        System.out.println("Задача 1");
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, " +
                    "то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
    }

    public static void ex02() {
        int temperature = 3;
        System.out.println("Задача 2");
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println();
    }

    public static void ex03() {
        int speed = 70;
        System.out.println("Задача 3");
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println();
    }

    public static void ex04() {
        int age = 20;
        System.out.println("Задача 4");
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        System.out.println();
    }

    public static void ex05() {
        int age = 5;
        System.out.println("Задача 5");
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", " +
                    "то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", " +
                    "то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();
    }

    public static void ex06() {
        int totalPasses = 102; //вместимость вагона
        int totalSeats = 60; //количество сидячих мест

        int seatsOccupied = 18; //занято мест

        System.out.println("Задача 6");
        if (seatsOccupied < totalSeats) {
            System.out.println("В вагоне осталось " + (totalSeats - seatsOccupied) + " сидячих мест");
        }
        if (seatsOccupied > totalSeats && seatsOccupied < totalPasses) {
            System.out.println("В вагоне осталось " + (totalPasses - seatsOccupied) + " стоячих мест");
        }
        if (seatsOccupied >= totalPasses) {
            System.out.println("В вагоне мест не осталось");
        }
        System.out.println();
    }

    public static void ex07() {
        int one;
        int two;
        int three;

        one = 10;
        two = 20;
        three = 30;

        System.out.println("Задача 7");
        if (one > two && one > three) {
            System.out.println("Число " + one + " самое большое");
        }
        if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое");
        }
        if (three > one && three > two) {
            System.out.println("Число " + three + " самое большое");
        }
    }
}
