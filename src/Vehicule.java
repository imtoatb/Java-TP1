public class Vehicule {
    String brand;
    int maxSpeed, currentSpeed;
    final int fiscalPower = 5; //Need to put a value
    static int nbVehicules = 0;
    int isOn;

    public Vehicule(String brand, int fiscalPower, int maxSpeed, int currentSpeed, int isOn) {
        this.brand = brand;
        //this.fiscalPower = fiscalPower;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.isOn = isOn;
        nbVehicules++;

    }

    public int start() {
        if (isOn == 0) {
            isOn = 1;
            return 1;
        }
        else {
            return 0;
        }
    }

    public int stop(){
        if (isOn == 1) {
            isOn = 0;
            return 1;
        }
        else {
            return 0;
        }
    }

    public void display(){
        System.out.println("Brand : " + brand);
        System.out.println("Fiscal Power : " + fiscalPower);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Current Speed : " + currentSpeed);
        System.out.println("Is On (0 : no, 1 : yes) : " + isOn);
    }

}
