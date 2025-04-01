package conditionAndSwitch;

public class Main {
    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
    }

    public static void ex01() {
        byte clientOS = 1;
        System.out.println("Задача 1");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static void ex02() {
        int clientDeviceYear = 2010;
        byte clientOS = 1;

        System.out.println("Задача 2");
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static void ex03() {
        int year = 2025;

        System.out.println("Задача 3");
        if (year > 1584 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }
        System.out.println();
    }

    public static void ex04() {
        int deliveryDistance = 95;
        int deliveryTime = 0;
        System.out.println("Задача 4");
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет!");
        } else {
            deliveryTime += 1;
            if (deliveryDistance > 60) {
                deliveryTime += 1;
            }
            if (deliveryDistance > 20) {
                deliveryTime += 1;
            }
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        System.out.println();
    }

    public static void ex05() {
        int monthNumber = 12;
        System.out.println("Задача 5");
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "-й месяц соответствует сезону зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц соответствует сезону весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц соответствует сезону лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц соответствует сезону осень!");
                break;
            default:
                System.out.println(monthNumber + "-й месяц. Такого месяца нет!");
        }
    }

}
