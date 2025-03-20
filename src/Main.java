import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("\n");

        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(3, 5);
        System.out.println(p1.distance(p1, p2));

        p1.display();
        System.out.println(Point.distanceStat(p1, p3));
        System.out.println("\n");


        Point corner = new Point(1, 2);
        corner.display();
        Rectangle rect = new Rectangle(corner, 4, 6);
        System.out.println("\n");


        Date d1 = new Date(03, 04, 2021);
        Date d2 = new Date(11, 12, 2021);
        d1.display();

        int result1 = d1.compareDate(d1, d2);
        System.out.println(result1);
        int result2 = Date.compareDateStatic(d1, d2);
        System.out.println(result2);
        /*
        Scanner askDate = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = askDate.nextInt();
        System.out.println("Enter the month: ");
        int month = askDate.nextInt();
        System.out.println("Enter the year: ");
        int year = askDate.nextInt();
        Date d3 = new Date(day, month, year);
        d3.display();
        */
        Date currentDate = new Date();
        currentDate.display();
        System.out.println("\n");


        /*
        Scanner car1 = new Scanner(System.in);
        System.out.println("Enter the brand : ");
        String brand1 = car1.nextLine();
        System.out.println("Enter the max speed : ");
        int ms1 = car1.nextInt();
        System.out.println("Enter the current speed : ");
        int cs1 = car1.nextInt();
        Vehicule MyVehicule1 = new Vehicule(brand1, 5, ms1, cs1, 0);
        MyVehicule1.display();

        MyVehicule1.stop();
        MyVehicule1.start();

        Scanner car2 = new Scanner(System.in);
        System.out.println("Enter the brand : ");
        String brand2 = car2.nextLine();
        System.out.println("Enter the max speed : ");
        int ms2 = car2.nextInt();
        System.out.println("Enter the current speed : ");
        int cs2 = car2.nextInt();
        Vehicule MyVehicule2 = new Vehicule(brand2, 5, ms2, cs2, 0);
        MyVehicule2.display();
        MyVehicule2.start();
        */
        System.out.println("Number of vehicules : " + Vehicule.nbVehicules);
        System.out.println("\n");



        BankAccount b = new BankAccount(1234, 1000, 5);
        b.display();
        b.interest = b.changeInterestRate();
        b.display();
        b.displayBalance();
        System.out.println("\n");

        Customer c = new Customer("John", "Doe", 123, b);
        c.display();
        c.deposit(100);
        c.display();
        c.withdraw(50);
        c.display();
    }
}



