<<<<<<< HEAD
import java.util.ArrayList;

public class CustomerArrayList {
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts;

    public CustomerArrayList(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account acct) {
        accounts.add(acct);
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }
}
=======
import java.util.ArrayList;

public class CustomerArrayList {
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts;

    public CustomerArrayList(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account acct) {
        accounts.add(acct);
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }
}
>>>>>>> 77f618237d2d6fdddcbe55919073ba41a9e57c5c
