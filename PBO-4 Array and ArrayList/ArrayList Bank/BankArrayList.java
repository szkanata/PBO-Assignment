<<<<<<< HEAD
public class BankArrayList {
    public static void main(String[] args) {
        BankAL bank = new BankAL();

        bank.addCustomer("John", "Doe");
        bank.addCustomer("Jane", "Smith");

        CustomerArrayList cust1 = bank.getCustomer(0);
        cust1.addAccount(new Account(500.00));
        cust1.getAccount(0).deposit(150.00);

        System.out.println("Jumlah Nasabah: " + bank.getNumOfCustomers());
        System.out.println("Nasabah 1: " + cust1.getFirstName() + " " + cust1.getLastName());
        System.out.println("Saldo Akun 1: $" + cust1.getAccount(0).getBalance());
    }
=======
public class BankArrayList {
    public static void main(String[] args) {
        BankAL bank = new BankAL();

        bank.addCustomer("John", "Doe");
        bank.addCustomer("Jane", "Smith");

        CustomerArrayList cust1 = bank.getCustomer(0);
        cust1.addAccount(new Account(500.00));
        cust1.getAccount(0).deposit(150.00);

        System.out.println("Jumlah Nasabah: " + bank.getNumOfCustomers());
        System.out.println("Nasabah 1: " + cust1.getFirstName() + " " + cust1.getLastName());
        System.out.println("Saldo Akun 1: $" + cust1.getAccount(0).getBalance());
    }
>>>>>>> 77f618237d2d6fdddcbe55919073ba41a9e57c5c
}