public class Application {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice", "Smith", 1, new BankAccount(1001, 2000, 2));
        Customer customer2 = new Customer("Bob", "Johnson", 2, new BankAccount(1002, 3500, 2));
        Customer customer3 = new Customer("Charlie", "Brown", 3, new BankAccount(1003, 5000, 2));


        System.out.println("\n");
        customer2.deposit(5000);

        System.out.println("Bob's interest rate to 1%");
        customer2.account.interest = 1;  // ⚠️ Direct modification

        System.out.println("\nBob's Updated Information:");
        customer2.display();

        System.out.println("\n Available Balances:");
        customer1.displayBalance();
        customer2.displayBalance();
        customer3.displayBalance();
    }
}
