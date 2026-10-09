<<<<<<< HEAD
import java.util.ArrayList;

public class BankAL {
    private ArrayList<CustomerArrayList> customers;

    public BankAL () {
        customers = new ArrayList<>();
    }

    public void addCustomer(String f, String l) {
        CustomerArrayList cust = new CustomerArrayList(f, l);
        customers.add(cust);
    }

    public int getNumOfCustomers() {
        return customers.size();
    }

    public CustomerArrayList getCustomer(int index) {
        if (index >= 0 && index < customers.size()) {
            return customers.get(index);
        }
        return null;
    }
=======
import java.util.ArrayList;

public class BankAL {
    private ArrayList<CustomerArrayList> customers;

    public BankAL () {
        customers = new ArrayList<>();
    }

    public void addCustomer(String f, String l) {
        CustomerArrayList cust = new CustomerArrayList(f, l);
        customers.add(cust);
    }

    public int getNumOfCustomers() {
        return customers.size();
    }

    public CustomerArrayList getCustomer(int index) {
        if (index >= 0 && index < customers.size()) {
            return customers.get(index);
        }
        return null;
    }
>>>>>>> 77f618237d2d6fdddcbe55919073ba41a9e57c5c
}