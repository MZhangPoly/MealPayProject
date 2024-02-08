public class Account() {
    private String name;
    private double balance;
    private int id;

    private static int accountsCreated = 0;

    public Account(String name) {
        this.name = name;
        balance = 0;

        id = accountsCreated;
        accountsCreated++;
    }

    public void Deposit(int deposit) {
        balance += deposit;
    }  

    public void Charge(int charge) {
        balance -= charge;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Account name: " + name + " - balance: " + balance + " - unique id: " + id;
    }
}