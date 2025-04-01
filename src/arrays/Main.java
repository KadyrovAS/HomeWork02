package arrays;

public class Main {
    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
    }

    public static void ex01() {
        int[] arrExpenses = new int[]{25_000, 18_000, 24_000, 31_000, 14_000};
        int total = 0;
        for (int value : arrExpenses) {
            total += value;
        }
        System.out.println("Задача 1");
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
        System.out.println();
    }

    public static void ex02() {
        int[] arrExpenses = new int[]{25_000, 18_000, 24_000, 31_000, 14_000};
        int maxExpenses = arrExpenses[0];
        int minExpenses = arrExpenses[0];
        for (int value : arrExpenses) {
            if (value > maxExpenses) {
                maxExpenses = value;
            }
            if (value < minExpenses) {
                minExpenses = value;
            }
        }
        System.out.println("Задача 2");
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей." +
                " Максимальная сумма трат за неделю составила " + maxExpenses + " рублей");
        System.out.println();
    }

    public static void ex03() {
        int[] arrExpenses = new int[]{25_000, 18_000, 24_000, 31_123, 14_000};
        int total = 0;
        double averageExpenses;
        for (int value : arrExpenses) {
            total += value;
        }

        System.out.println("Задача 3");
        averageExpenses = (double) total / arrExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");
        System.out.println();
    }

    public static void ex04() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int l = reverseFullName.length;

        for (int i = 0; i < l / 2; i++) {
            char value = reverseFullName[i];
            reverseFullName[i] = reverseFullName[l - 1 - i];
            reverseFullName[l - 1 - i] = value;
        }

        System.out.println("Задача 4");
        for (char value : reverseFullName) {
            System.out.print(value);
        }
        System.out.println();
        System.out.println();
    }
}

