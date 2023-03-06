public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1 () {
        System.out.println("Задача 1");


        int many = 15_000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + many;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
            i++;
        }
    }
    public static void task2 () {

        System.out.println("Задача 2");

        int a = 1;
        int b = 10;
        while (a <= 10) {
            System.out.print(" " + a);
            a++;
        }
        System.out.println();
        for (b = 10; b >= 1; b--) {
            System.out.print(" " + b);
        }
        System.out.println();
    }
    public static void task3 () {

        System.out.println("Задача 3");

        double population = 12_000_000;
        int deathRate = 8;
        int birthRate = 17;

        int year = 0;
        while (year < 10) {
            population = population + (birthRate - deathRate) / 1000.0 * population;
            System.out.printf("%.2f \n", population);
            year++;
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");

        double cash = 15000;
        while (cash < 12_000_000) {
            cash = cash + cash * 0.07;
            System.out.printf("%.2f \n", cash);
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");

        double sum = 15000;
        for (int month = 1; sum < 12_000_000; month++) {
            sum = sum + sum * 0.07;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + " %.2f \n", sum);

            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");

        double rub = 15000;
        for (int months = 1; months <= 12 * 9; months++) {
            rub = rub + rub * 0.07;
            if (months % 6 == 0) {
                System.out.printf("Месяц " + months + " %.2f \n", rub);
            }
        }
    }
    public static void task7 () {

            System.out.println("Задача 7");

            int oneFriday = 5;
            for (int f = oneFriday; f <= 31; f = f + 7) {
                System.out.println("Сегодня пятница " + f + "-е число. Необходимо подготовить отчет.");
            }

       }
    }




