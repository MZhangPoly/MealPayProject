import java.util.ArrayList;

public class Account {
    private String name;
    private double balance;
    private int id;

    private static int accountsCreated = 0;

    private static ArrayList<Transaction> transactions;

    public Account(String name) {
        this.name = name;
        balance = 0;

        id = accountsCreated;
        accountsCreated++;

        transactions = new ArrayList<Transaction>();
    }

    public void addTransactionToLog(Transaction transaction) {
        transactions.add(transaction);
    }

    public ArrayList<Transaction> getTransations() {
        return transactions;
    }

    public void changeBalance(double change) {
        balance += change;
    }

    public void deposit(double deposit) {
        balance += deposit;
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