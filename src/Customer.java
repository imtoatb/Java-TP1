public class Customer {
    String firstname, lastname;
    int id;
    BankAccount account;

    public Customer(String firstname, String lastname, int id, BankAccount account) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.account = account;
    }

    public void display() {
        System.out.println("First name : " + firstname);
        System.out.println("Last name : " + lastname);
        System.out.println("ID : " + id);
        account.display();
    }


    public int deposit(int amount) {
        account.balance += amount;
        return 1;
    }

    public int withdraw(int amount) {
        account.balance -= amount;
        return 1;
    }

    public void displayBalance() {
        account.displayBalance();
    }

}
