<<<<<<< HEAD
public class BankA {
    private CustomerArray[] customers;
    private int numberOfCustomers;   
    
    public BankA() {
        customers = new CustomerArray[5];
        this.numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l) {
        if (numberOfCustomers < customers.length) {
            CustomerArray cust = new CustomerArray(f, l);
            customers[numberOfCustomers++] = cust;
        } else {
            System.out.println("Kapasitas Bank sudah penuh!");
        }
        
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public CustomerArray getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }
}
=======
public class BankA {
    private CustomerArray[] customers;
    private int numberOfCustomers;   
    
    public BankA() {
        customers = new CustomerArray[5];
        this.numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l) {
        if (numberOfCustomers < customers.length) {
            CustomerArray cust = new CustomerArray(f, l);
            customers[numberOfCustomers++] = cust;
        } else {
            System.out.println("Kapasitas Bank sudah penuh!");
        }
        
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public CustomerArray getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }
}
>>>>>>> 77f618237d2d6fdddcbe55919073ba41a9e57c5c
