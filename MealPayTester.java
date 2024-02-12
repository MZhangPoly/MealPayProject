public class MealPayTester {
    public static void main(String[] args) {
        System.out.println("Creating student accounts... \n");

        Account bob = new Account("Bob"); 
        Account matt = new Account("Matt"); 
        Account sasha = new Account("Sasha"); 
        Account hailey = new Account("Hailey"); 

        System.out.println("Displaying all accounts...");
        System.out.println(AccountHandler.displayAllAccounts());

        System.out.println("\n Depositing some funds and making purchases");

        bob.deposit(15d);
        matt.deposit(12d);
        sasha.deposit(10d);
        hailey.deposit(5d);

        System.out.println("\n Displaying all accounts...");
        System.out.println(AccountHandler.displayAllAccounts());

        AccountHandler.createTransaction(hailey, -7, new Date(9, 27, 2023));
        AccountHandler.createTransaction(matt, -7, new Date(9, 27, 2023));
        AccountHandler.createTransaction(matt, -7, new Date(9, 28, 2023));
        AccountHandler.createTransaction(bob, -7, new Date(9, 30, 2023));

        System.out.println("\n Displaying all accounts...");
        System.out.println(AccountHandler.displayAllAccounts());

        System.out.println("\n looking up student with ID number of 2");
        System.out.println(AccountHandler.getAccountFromId(2));

        System.out.println("\n Displaying all transactions of 9/27/2023");
        AccountHandler.getAllTransactionsOnDate(new Date(9, 27, 2023));
    }
}