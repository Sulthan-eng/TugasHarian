package Vehicle.ok;

public class AirVehicle extends Vehicle {
    //fields
    private boolean hasPropeller;

    //subclass konstruktor mengambil nilai args, memanggil konstruktor super dan meneruskan nilai
    public AirVehicle(String name, int speed, double fuelLevel, boolean hasPropeller) {
        super(name, speed, fuelLevel);
        this.setHasPropeller(hasPropeller);
    }

    //Getter untuk mengembalikan field hasPropeller
    public boolean hasPropeller() {
        return hasPropeller;
    }

    //Setter untuk field has Propeller()
    public void setHasPropeller(boolean hasPropeller) {
        this.hasPropeller = hasPropeller;
    }

    //implementasi metode move()
    @Override //optional, untuk memastikan sudah benar-benar override metode di abstract class
    public void move() {
        System.out.println(getName() + " bergerak di udara dengan kecepatan " + getSpeed() + " km/jam, menggunakan baling-baling: " + hasPropeller);
    }

    //implementasi metode calculateFuelConsumption(double distance)
    @Override
    public void calculateFuelConsumption(double distance){
        //menghitung bahan bakar yang
        double fuelConsumption = distance / 6;
        double remainingFuelLevel = getFuelLevel() - fuelConsumption;

        setFuelLevel(remainingFuelLevel);
        System.out.println("Konsumsi Bahan Bakar Untuk " + distance + "km: " + fuelConsumption + "%,Sisa bahan bakar: " + remainingFuelLevel + "%");
    }

    //implementasi fitur tambahan di class abstract
    @Override
    public void stop(){
        System.out.println(getName() + " ini berhenti ketika telah mendarat");
    }

    //implementasi interface Refuelable
    @Override
    public void refuel(double amount){
        //menambah jumlah bahan bakar ke bahan bakar terbaru
        double newFuelLevel = getFuelLevel() + amount;

        //bisa assign nilai bila telah divalidasi
        newFuelLevel = validateFuelLevel(newFuelLevel);
        setFuelLevel(newFuelLevel);
    }
    @Override
    public boolean isFuelLow(){
        return getFuelLevel() < 20;
    }
}