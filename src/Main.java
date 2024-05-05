public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        for (int i = 0; i < 17; i = i + 2){
            System.out.println(i);
        }

        for (int i = 10; i > -11; i--){
            System.out.println(i);
        }

        for (int i = 1904; i < 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }

        for (int i = 7; i < 99; i = i + 7){
            System.out.println(i);
        }

        for (int i = 1; i < 513; i = i * 2){
            System.out.println(i);
        }

        int moneyEveryMonth = 29000;
        int total = 0;
        int month = 0;
        for (float i = 0; i < 12; i++){
            total = total + moneyEveryMonth;
            total = total + total / 100;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений - " + total + " рублей");
        }

        int two = 2;
        for (int i = 1;i < 11; i++){
            System.out.println(" 2 * " + i + " = " + two * i );
        }

    }
}