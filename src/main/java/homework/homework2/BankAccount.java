package homework.homework2;

public class BankAccount {
    private int accountNumber;
    private  double balance;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Сумма должна быть положительной");
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма должна быть положительной");
        }
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств");
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}
