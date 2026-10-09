<<<<<<< HEAD
public class BankArray {
    public static void main(String[] args) {
        // Buat objek Bank
        BankA bank = new BankA();

        // Tambah customer ke Bank
        bank.addCustomer("John", "Doe");
        bank.addCustomer("Jane", "Smith");

        CustomerArray cust1 = bank.getCustomer(0);

        Account acc1 = new Account(500.00);
        cust1.setAccount(acc1);

        cust1.getAccount(0).deposit(200.00);
        cust1.getAccount(0).withdraw(50.00);

        // Cetak Informasi Hasil
        System.out.println("=== INFORMASI BANK ===");
        System.out.println("Jumlah Nasabah  : " + bank.getNumOfCustomers());
        System.out.println("Nama Nasabah 1  : " + cust1.getFirstName() + " " + cust1.getLastName());
        System.out.println("Saldo Akun Utama: $" + cust1.getAccount(0).getBalance());
    }
}
=======
public class BankArray {
    public static void main(String[] args) {
        // Buat objek Bank
        BankA bank = new BankA();

        // Tambah customer ke Bank
        bank.addCustomer("John", "Doe");
        bank.addCustomer("Jane", "Smith");

        CustomerArray cust1 = bank.getCustomer(0);

        Account acc1 = new Account(500.00);
        cust1.setAccount(acc1);

        cust1.getAccount(0).deposit(200.00);
        cust1.getAccount(0).withdraw(50.00);

        // Cetak Informasi Hasil
        System.out.println("=== INFORMASI BANK ===");
        System.out.println("Jumlah Nasabah  : " + bank.getNumOfCustomers());
        System.out.println("Nama Nasabah 1  : " + cust1.getFirstName() + " " + cust1.getLastName());
        System.out.println("Saldo Akun Utama: $" + cust1.getAccount(0).getBalance());
    }
}
>>>>>>> 77f618237d2d6fdddcbe55919073ba41a9e57c5c
