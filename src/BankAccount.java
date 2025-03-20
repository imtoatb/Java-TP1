import java.util.Scanner;

public class BankAccount {
    int numAccount, balance, interest;

    public BankAccount(int numAccount, int balance, int interest) {
        this.numAccount = numAccount;
        this.balance = balance;
        this.interest = interest;
    }

    public int display(){
        System.out.println("Account number : " + numAccount);
        System.out.println("Balance : " + balance);
        System.out.println("Interest rate : " + interest);
        return 1;
    }

    public int changeInterestRate(){
        //ask the user to choose the interest
        Scanner newInterestRate = new Scanner(System.in);
        System.out.println("Enter the interest rate : ");
        int userChoice = newInterestRate.nextInt();
        BankAccount myAccount = new BankAccount(1234, 1000, userChoice);
        return 1;
    }

    public int addInterest() {
        Scanner askInterest = new Scanner(System.in);
        System.out.println("Enter the interest rate to add : ");
        int interest = askInterest.nextInt();
        balance += (balance * interest) / 100;
        return 1;
    }

    public void displayBalance(){
        System.out.println("The balance of the account is : " + balance);
    }


}
