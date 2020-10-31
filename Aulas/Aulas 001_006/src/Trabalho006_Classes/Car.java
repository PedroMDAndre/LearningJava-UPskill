package Trabalho006_Classes;

public class Car {
    // Attributes
    private String brand;
    private String model;
    private int nr_seats;
    private String plate;
    private int registrationYear;
    private int registrationMonth;
    private double consumption_100km;
    private double tankCapacity;
    private double tankLevel;
    private Person owner;
    private boolean turnedOn;
    private double totalKm;


    // Constructors
    public Car(String brand, String model, double consumption_100km, double tankCapacity) {
        this.brand = brand;
        this.model = model;
        this.consumption_100km = consumption_100km;
        this.tankCapacity = tankCapacity;
        this.tankLevel = 0;
        this.turnedOn = false;
    }


    // Methods
    @Override
    public String toString() {
        String result = brand + " " + model + " | Plate: " + plate + " Reg. Date: " +
                registrationYear + " " + registrationMonth + " Owner: " + owner +
                "\nTank level: " + tankLevel + "/" + tankCapacity + "\t| Turned on? " + turnedOn + "\n";
        return result;
    }

    public void fillTank() {
        if (isTurnedOn()) {
            this.turnOff();
        }
        double liters = tankCapacity - tankLevel;
        System.out.println("The car was filled with " + liters + " liters");
        this.tankLevel = this.tankCapacity;
    }

    public void run(double distance) {
        if (!isTurnedOn()) {
            this.turnOn();
        }
        double expectedConsumption = consumption_100km * distance / 100;
        if (expectedConsumption > tankLevel) {
            double travelledDistance = (tankLevel* 100 / consumption_100km);
            totalKm += travelledDistance;
            this.turnOff();
            System.out.println("The car is out of fuel!");
            System.out.println("The car travelled " + travelledDistance + " km.");
        } else {
            System.out.println("The car travelled " + distance + " km.");
            tankLevel -= consumption_100km * distance / 100;
            totalKm += distance;
        }
    }

    public void run() {
        this.run(1);
    }

    public void carRegistrarion(
            Person owner, String plate, int nr_seats,
            int registrationYear, int registrationMonth) {

        this.owner = owner;
        this.plate = plate;
        this.nr_seats = nr_seats;
        this.registrationYear = registrationYear;
        this.registrationMonth = registrationMonth;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void turnOn() {
        System.out.println("The car was turned on.");
        turnedOn = true;
    }

    public void turnOff() {
        System.out.println("The car was turned off.");
        turnedOn = false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getConsumption_100km() {
        return consumption_100km;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getTankLevel() {
        return tankLevel;
    }

    public int getNr_seats() {
        return nr_seats;
    }

    public int getRegistrationMonth() {
        return registrationMonth;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public Person getOwner() {
        return owner;
    }

    public String getPlate() {
        return plate;
    }

    public double getTotalKm() {
        return totalKm;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setConsumption_100km(double consumption_100km) {
        this.consumption_100km = consumption_100km;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void setTankLevel(double tankLevel) {
        this.tankLevel = tankLevel;
    }

}
