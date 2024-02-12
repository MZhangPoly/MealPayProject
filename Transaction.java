public class Transaction {
    private Account account;
    private double balanceChange;
    private Date date;

    public Transaction(Account account, double balanceChange, Date date) {
        this.account = account;
        this.balanceChange = balanceChange;
        this.date = date;

        AccountHandler.addTransactionToLog();
    }

    public Date getDate() {
        return date;
    }

    public double getBalanceChange() {
        return balanceChange;
    }

    public Account getAccount() {
        return account;
    }
}