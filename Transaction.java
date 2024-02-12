public class Transaction {
    private Account account;
    private double balanceChange;

    public Transaction(Account account, double balanceChange) {
        this.account = account;
        this.balanceChange = balanceChange;
    }
}