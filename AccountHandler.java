public static class AccountHandler {
    //display all transactions on a given date
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public void addTransactionToLog(Transaction transaction) {
        transactions.add(transaction);
    }

    public String displayAllAccounts() {
        String str = "";

        for (Account account : accounts)
            str += account + "\n";

        return str;
    }

    public String displayAllNegativeAccounts() {
        String str = "";

        for (Account account : accounts) 
            if (account.getBalance < 0)
                str += account + "\n";
        
        return str;
    }

    public String getAccountFromId(int id) {
        for (Account account : accounts)
            if (account.getId == id)
                return account.toString();
            else
                return "No account found!";

    }   

    public ArrayList<Transaction> getAllTransactionsOnDate(Date date) {
        ArrayList<Transaction> t = new ArrayList<Transaction>();

        for (Transaction transaction : transactions)
            if (Arrays.Equals(transaction.getDate().getDateArray(), date.getDateArray()))
                t.add(transaction);

        return t;
    }
}