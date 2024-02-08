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
}