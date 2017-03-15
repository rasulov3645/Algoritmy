package chapter1.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class BankAccount {
    // Баланс счета
    private double balance;

    // Конструктор
    public BankAccount(double openingBalance) {
        balance = openingBalance;
    }

    // Внесение средств
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Снятие средства
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    // Вывод баланса
    public void display() {
        System.out.println("balance = " + balance);
    }
}
