package variables;

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
        byte vByte = 127;
        short vShort = 32767;
        int vInt = 2147483647;
        long vLong = 9223372036854775807l;


        float vFloat = 3.4028235E38f;
        double vDouble = 1.7976931348623157E308;

        System.out.println("Задача 1");
        System.out.println("Максимальные значенияеременных с разными типами:");
        System.out.println("Значение переменной vByte с типом byte равно " + vByte);
        System.out.println("Значение переменной vShort с типом short равно " + vShort);
        System.out.println("Значение переменной vInt с типом int равно " + vInt);
        System.out.println("Значение переменной vLong с типом long равно " + vLong);
        System.out.println("Значение переменной vFloat с типом float равно " + vFloat);
        System.out.println("Значение переменной vDouble с типом double равно " + vDouble);
        System.out.println();
    }

    public static void ex02() {
        float vFloat1 = 27.12f;
        long vLong = 987678965549l;
        float vFloat2 = 2.786f;
        short vShort1 = 569;
        short vShort2 = -159;
        short vShort3 = 27897;
        byte vByte = 67;
    }

    public static void ex03() {
        byte lp = 23; //учеников у Людмилы Павловны
        byte as = 27; //учеников у Анны Сергеевны
        byte ea = 30; //учеников у Екатерины Андреевны
        short totalSheets = 480; //Всего листов бумаги

        int totalStudents = lp + as + ea; //Всего учеников
        int numberSheets = totalSheets / totalStudents; //Количество листов бумаги на каждого ученика

        System.out.println("Задача 3");
        System.out.println("На каждого ученика рассчитано " + numberSheets + " листов бумаги");
        System.out.println();
    }

    public static void ex04() {
        byte efficiency2 = 16; //производительность за 2 минуты
        int efficiency = efficiency2 / 2; //производительность за 1 минуту

        int efficiency20 = efficiency * 20; //производительность за 20 минут
        int efficiencyDay1 = efficiency * 60 * 24; //производительность за дсутки
        int efficiencyDay3 = efficiencyDay1 * 3; //производительность за 3 дня
        int efficiencyMonth = efficiencyDay1 * 30; //производительность за 1 месяц

        System.out.println("Задача 4");
        System.out.println("За 20 минут машина произвела " + efficiency20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + efficiencyDay1 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + efficiencyDay3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + efficiencyMonth + " штук бутылок");
        System.out.println();
    }

    public static void ex05(){
        byte totalPaintSchool = 120; //Требуется всего банок краски
        byte whitePaint = 2; //требуется банок белой краски
        byte brownPaint = 4; //требуется банок коричневой краски
        int totalPaintRoom = whitePaint + brownPaint; //требуется банок краски на один класс
        int numberRooms = totalPaintSchool / totalPaintRoom; //количество классов
        int totalWhitePaint = numberRooms * whitePaint; //куплено банок белой краски
        int totalBrownPaint = numberRooms * brownPaint; //куплено банок коричневой краски

        System.out.println("Задача 5");
        System.out.println("В школе, где " + numberRooms + " классов, нужно " + totalWhitePaint +
                " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        System.out.println();
    }

    public static void ex06(){
        byte weightBanana = 80; //вес одного банана
        byte weightMilk = 105; //вес 100мл молока
        byte weightIceCream = 100; //вес 1 брикета мороженого
        byte weightEgg = 70; //вес одного яйца

        byte needBanana = 5; //требуется банан
        byte needMilk = 2; //требуется молока
        byte needIceCream = 2; //требуется мороженого
        byte needEgg = 4; //требуется яиц

        int totalGramm = weightBanana * needBanana + weightMilk * needMilk +
                weightIceCream * needIceCream + weightEgg * needEgg; //масса завтрака в нраммах

        float totalKg = totalGramm / 1000f; //масса завтрака в килограммах

        System.out.println("Задача 6");
        System.out.println("Вес завтрака спортсмена " + totalGramm + " грамм (" + totalKg + " килограмм)");
        System.out.println();
    }

    public static void ex07(){
        byte needLoseWeight = 7; //Необходимо сбросить килограмм
        short loseWeight1 = 250; //Теряет вес в день (грамм)
        short loseWeight2 = 500; //Теряет вес в день (грамм)

        int numberDays1 = needLoseWeight * 1000 / loseWeight1; //потребуется дней, если будет терять по 1-му варианту
        int numberDays2 = needLoseWeight * 1000 / loseWeight2; //потребуется дней, если будет терять по 2-му варианту

        System.out.println("Задача 7");
        System.out.println("Если спортсмен будет терять в день " + loseWeight1 + " граммов, то ему потребуется " +
                numberDays1 + " дней, чтобы сбросить " + needLoseWeight + " килограмм");
        System.out.println("Если спортсмен будет терять в день " + loseWeight2 + " граммов, то ему потребуется " +
                numberDays2 + " дней, чтобы сбросить " + needLoseWeight + " килограмм");
        System.out.println();
    }

    public static void ex08(){
        //зарплата в месяц до повышения
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        //уровень повышения з/п
        byte levelImprovementProcent = 10; //в процентах
        float levelImprovement = levelImprovementProcent / 100f;

        //зарплата после повышения
        int newSalaryMasha = salaryMasha + (int)(salaryMasha * levelImprovement);
        int newSalaryDenis = salaryDenis + (int)(salaryDenis * levelImprovement);
        int newSalaryKristina = salaryKristina + (int)(salaryKristina * levelImprovement);

        //на сколько вырос годовой доход
        int salaryDifferenceMasha = (newSalaryMasha - salaryMasha) * 12;
        int salaryDifferenceDenis = (newSalaryDenis - salaryDenis) * 12;
        int salaryDifferenceKristina = (newSalaryKristina - salaryKristina) * 12;

        System.out.println("Задача 8");
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. " +
                "Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. " +
                "Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. " +
                "Годовой доход вырос на " + salaryDifferenceKristina + " рублей");
    }
}
