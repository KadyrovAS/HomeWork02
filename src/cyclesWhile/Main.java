package cyclesWhile;

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
    }

    public static void ex01() {
        int total = 0;
        int yearCount = 0;
        int goal = 2_459_000;
        int contribution = 15_000;

        do {
            yearCount++;
            total += contribution;
        } while (total < goal);

        System.out.println("Задача 1");
        System.out.println("Месяц " + yearCount + ", сумма накоплений равна " + total + " рублей");
        System.out.println();
    }

    public static void ex02() {
        int i = 0;
        System.out.println("Задача 2");
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void ex03() {
        int population = 12_000_000;
        int birthRate = 17; //рождаемость на 1000 человек
        int mortalityRate = 8; //смертность
        int wasBirth;

        System.out.println("Задача 3");
        for (int i = 1; i <= 10; i++) {
            wasBirth = population / 1000 * birthRate; //родилось
            population = population + wasBirth - mortalityRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.println();
    }

    public static void ex04() {
        int total = 15_000;
        int interest = 7;
        int goal = 12_000_000;
        int monthCount = 0;

        System.out.println("Задача 4");
        while (total < goal) {
            monthCount++;
            total += total * interest / 100;
            System.out.println(monthCount + "-й месяц. Сумма вклада " + total + " рублей");
        }
        System.out.println();
    }

    public static void ex05() {
        int total = 15_000;
        int interest = 7;
        int goal = 12_000_000;
        int monthCount = 0;

        System.out.println("Задача 5");
        while (total < goal) {
            monthCount++;
            total += total * interest / 100;
            if (monthCount % 6 == 0) {
                System.out.println(monthCount + "-й месяц. Сумма вклада " + total + " рублей");
            }
        }
        System.out.println();

    }

    public static void ex06() {
        int total = 15_000;
        int interest = 7;

        System.out.println("Задача 6");

        for (int i = 1; i <= 9 * 12; i++) {
            total += total * interest / 100;
            if (i % 6 == 0) {
                System.out.println(i + "-й месяц. Сумма вклада " + total + " рублей");
            }
        }
        System.out.println();

    }

    public static void ex07() {
        int firstFriday = 7;
        int totalDays = 31;

        System.out.println("Задача 7");
        for (int i = firstFriday; i <= totalDays; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
    }

    public static void ex08() {
        int currentYear = 2025;
        int step = 79;
        int yearsBefore = 200;
        int yearsAfter = 100;
        int calculateYear = 0;

        System.out.println("Задача 8");
        while (calculateYear <= currentYear + yearsAfter){
            if (calculateYear >= currentYear - yearsBefore && calculateYear <= currentYear + yearsAfter){
                System.out.println(calculateYear);
            }
            calculateYear+=step;
        }
        System.out.println();
    }
}
