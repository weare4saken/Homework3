public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным");
            }
        }
    }

    public static void task6() {
        System.out.println("\nЗадача 6");
        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        for (int i = 1; i < 1000; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("\nЗадача 8");
        int sum = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + sum;
            System.out.println("Месяц " + i + ": сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("\nЗадача 9");
        int sum = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + sum;
            System.out.println("Месяц " + i + ": сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        System.out.println("\nЗадача 10");
        int fibo1 = 1;
        int fibo2 = 0;
        int fibonacci;
        for (int i = 0; i < 11; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.println(fibonacci);
        }
    }

    public static void task11() {
        System.out.println("\nЗадача 11");
        int total = 0;
        int sum = 15_000;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + sum;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна: " + total + " рублей");
        }
    }

    public static void task12() {
        System.out.println("\nЗадача 12");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public static void task13() {
        System.out.println("\nЗадача 13");
        int populationY = 12_000_000;
        int birthRate = 17; // на 1000 человек
        int deathRate = 8; // на 1000 человек
        int populationGrowthOnThousandPeople = birthRate - deathRate; // на 1000 человек
        int howThousandsY = populationY / 1000;
        int populationGrowth = populationGrowthOnThousandPeople * howThousandsY;
        for (int i = 1; i <= 10; i++) {
            populationY = populationY + populationGrowth;
            System.out.println("Год " + i + ", численность населения составляет: " + populationY);
        }
    }

    public static void task14() {
        System.out.println("\nЗадача 14");
        float total = 15_000f;
        int i = 0;
        while (total < 12_000_000) {
            total = total + (total / 100 * 7);
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений: " + (int) total);
        }
    }

    public static void task15() {
        System.out.println("\nЗадача 15");
        float total = 15_000f;
        int i = 0;
        while (total < 12_000_000) {
            total = total + (total / 100 * 7);
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений: " + (int) total);
            }
        }
    }

    public static void task16() {
        System.out.println("\nЗадача 16");
        int sumYears = 9;
        int sumMonths = sumYears * 12;
        float total = 15_000f;
        int i = 0;
        while (i < sumMonths) {
            total = total + (total / 100 * 7);
            i++;
            if (i % 6 == 0) {
                System.out.println("Сумма накоплений за " + i / 6 + " полугодие, составляет: " + (int) total);
            }
        }
    }

    public static void task17() {
        System.out.println("\nЗадача 17");
        int friday = 3;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        } while (friday <= 31);
    }

    public static void task18() {
        System.out.println("\nЗадача 18");
        int year = 0;
        int yearEarly = 1822;
        int yearAgo = 2122;
        while (year < yearAgo) {
            year = year + 79;
            if (year > yearEarly && year < yearAgo) {
                System.out.println(year);
            }
        }
    }

    public static void task19() {                                       // Второй вариант решения задачи N17 про пятницу
        System.out.println("\nЗадача 19");
        int firstDate = 3;
        int friday = firstDate;
        int i = 0;
        do {
            friday = friday + i;
            if (!(friday % 7 == firstDate)) {
                continue;
            } else {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
                i = 1;
            }
        } while (friday <= 31);
}
}

