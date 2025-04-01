package methods;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2025;

        int clientDeviceYear = 2025;
        int operatingSystemType = 1;

        int deliveryDistance = 95;

        System.out.println("Задача 1");
        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }
        System.out.println();

        System.out.println("Задача 2");
        System.out.println(getRecommendation(clientDeviceYear, operatingSystemType));
        System.out.println();

        System.out.println("Задача 3");
        int deliveryTime = calculateDeliveryTime(deliveryDistance);
        if (deliveryTime == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1584) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public static String getRecommendation(int year, int type) {
        int currentYear = LocalDate.now().getYear();

        if (year < currentYear && type == 0) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        }
        if (year < currentYear && type == 1) {
            return "Установите облегченную версию приложения для Android по ссылке";
        }
        if (type == 0) {
            return "Установите версию приложения для iOS по ссылке";
        }
        return "Установите версию приложения для Android по ссылке";
    }

    public static int calculateDeliveryTime(int distance) {
        if (distance < 20) {
            return 1;
        }
        if (distance <= 60) {
            return 2;
        }
        if (distance <= 100) {
            return 3;
        }
        return 0; //доставки нет
    }
}
