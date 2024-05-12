public class Main {
    public static void main(String[] args) {
        {
            int total = 0;
            int month = 0;
            while (total < 2_459_000) {
                total += 15_000;
                month++;
            }
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            System.out.println();
        }

        {
            int number = 0;
            while (number < 10) {
                number++;
                System.out.print(number + " ");

            }
            System.out.println();
            for (; number > 0; number--) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        {
            System.out.println();
            int population = 12_000_000;
            int deathRate = 8;
            int birthRate = 17;
            for (int i = 1; i <= 10; i++) {
                population = population + (birthRate - deathRate) * population / 1000;
                System.out.println("Год " + i + " численность составляет " + population + " человек");
            }
            System.out.println();
        }

        {
            int dep = 15_000;
            int month = 1;
            while (dep < 12_000_000) {
                dep = dep + (int) (dep * 0.07);
                System.out.println("Месяц " + month + " , сумма накоплений равна " + dep);
                month++;
            }
            System.out.println();
        }

        {
            int dep = 15_000;
            int month = 1;
            while (dep < 12_000_000) {
                dep = dep + (int) (dep * 0.07);
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + " ,сумма накоплений равна " + dep);
                }
                month++;
            }
            System.out.println();
        }

        {
            int dep = 15_000;
            var period = 9 * 12;
            for (int month = 1; month < period; month++) {
                dep = dep + (int) (dep * 0.07);
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + " ,сумма накоплений равна " + dep);
                }
            }
            System.out.println();
        }

        {
            for (int day = 2; day < 31; day += 7) {
                System.out.println("Сегодня пятница " + day + " -e число, необходимо подготовить отчет");
            }
            System.out.println();
        }

        {
            for (int year = 2024 - 200; year < 2024 + 100; year++) {
                if (year % 79 == 0) {
                    System.out.println(year);
                }
            }
        }


    }
}


