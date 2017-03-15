package chapter1.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class BankApp {

    public static void main(String[] args) {
        // Создание счета
        BankAccount bal = new BankAccount(100.00);

        System.out.println("Before transactions, ");
        bal.display();                       // Вывод баланса

        bal.deposit(74.35);          // Внесение средства
        bal.withdraw(20.00);         // Снятие средства

        System.out.println("After transactions, ");
        bal.display();                       // Вывод баланса
    }
}
