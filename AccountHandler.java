import java.util.*;

public class AccountHandler {
    //display all transactions on a given date
    private static ArrayList<Account> accounts = new ArrayList<Account>();

    public static void addAccount(Account account) {
        accounts.add(account);
    }

    public static String displayAllAccounts() {
        String str = "";

        for (Account account : accounts)
            str += account + "\n";

        return str;
    }

    public static String displayAllNegativeAccounts() {
        String str = "";

        for (Account account : accounts) 
            if (account.getBalance() < 0)
                str += account + "\n";
        
        return str;
    }

    public static String getAccountFromId(int id) {
        for (Account account : accounts)
            if (account.getId() == id)
                return account.toString();
        
        return "No account found!";
    }   

    public static ArrayList<Transaction> getAllTransactionsOnDate(Date date) {
        ArrayList<Transaction> t = new ArrayList<Transaction>();

        for (Account account : accounts)
            for (Transaction transaction : account.getTransations())
                if (Arrays.equals(transaction.getDate().getDateArray(), date.getDateArray()))
                    t.add(transaction);

        return t;
    }

    public static void applyTransactionToAccount(Transaction transaction, Account account) {
        account.changeBalance(transaction.getBalanceChange());
        account.addTransactionToLog(transaction);
    }

    public static void createTransaction(Account account, double balanceChange, Date date) {
        Transaction transaction = new Transaction(account, balanceChange, date);
    }
}