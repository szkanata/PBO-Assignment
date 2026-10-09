<<<<<<< HEAD
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            System.err.println("Deposit tidak boleh negatif");
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        } else {
            System.err.println("Saldo tidak cukup!");
            return false;
        }
    }
=======
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            System.err.println("Deposit tidak boleh negatif");
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        } else {
            System.err.println("Saldo tidak cukup!");
            return false;
        }
    }
>>>>>>> 77f618237d2d6fdddcbe55919073ba41a9e57c5c
}