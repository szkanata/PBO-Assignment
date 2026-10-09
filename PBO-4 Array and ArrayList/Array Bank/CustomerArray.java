<<<<<<< HEAD

public class CustomerArray {
    private String firstName;
    private String lastName;
    private Account[] accounts = new Account[5];
    private int numberOfAccounts = 0;

    public CustomerArray(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setAccount(Account acct) {
        if (numberOfAccounts < 5) {
            accounts[numberOfAccounts++] = acct;
        }
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < numberOfAccounts) {
            return accounts[index];
        }
        return null;
    }
}
=======

public class CustomerArray {
    private String firstName;
    private String lastName;
    private Account[] accounts = new Account[5];
    private int numberOfAccounts = 0;

    public CustomerArray(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setAccount(Account acct) {
        if (numberOfAccounts < 5) {
            accounts[numberOfAccounts++] = acct;
        }
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < numberOfAccounts) {
            return accounts[index];
        }
        return null;
    }
}
>>>>>>> 77f618237d2d6fdddcbe55919073ba41a9e57c5c
