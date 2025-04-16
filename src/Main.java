public class Main {
    public static void main(String[] args) {

        int actualBalance = 300;
        int deposit = 2000;

        int bonus;
        if (deposit >= 1000) {
            bonus = (actualBalance + deposit) / 100;
        } else {
            bonus = 0;
        }

        int summary = actualBalance + deposit + bonus;

        System.out.println(" Сумма баланса: " + (summary) + " руб. ");
        System.out.println(" Количество бонусов: " + (bonus) + " руб. ");
    }
}