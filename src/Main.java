public class Main {
    public static void main(String[] args) {
        int balance = 100;
        System.out.println("Ваш баланс: " + balance + " рублей.");
        int cashIn = 1100;
        System.out.println("Пополнение на сумму " + cashIn + " рублей.");
        balance += cashIn;
        if (cashIn > 1000) {
            int bonus = cashIn / 100;
            System.out.println("Ваш бонус: " + bonus + " рублей.");
            balance += bonus;
        }
        System.out.println("Ваш баланс: " + balance + " рублей.");
    }
}