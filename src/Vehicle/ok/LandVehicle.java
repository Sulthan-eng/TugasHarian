package Vehicle.ok;

//subclass LandVehicle mewarisi abstract class Vehicle dan mengimplementasikan interface
public class LandVehicle extends Vehicle  {
    //new fields
    private final int wheels; //jumlah roda

    //subclass konstruktor mengambil nilai args, memanggil konstruktor super dan meneruskan nilai
    public LandVehicle(String name, int speed, double fuelLevel, int wheels) {
        super(name, speed, fuelLevel);
        this.wheels = wheels;
    }

    //implementasi metode dari abstract class
    @Override  //optional, untuk memastikan sudah benar-benar override metode di abstract class
    public void move(){
        System.out.println(getName() + " bergerak di darat dengan " + wheels + " roda pada kecepatan " + getSpeed() + " km/jam");
    }

    @Override
    public void calculateFuelConsumption(double distance){
        double fuelConsumption = distance / 10;
        double remainingFuelLevel = getFuelLevel() - fuelConsumption;

        setFuelLevel(remainingFuelLevel);
        System.out.println("Konsumsi Bahan Bakar Untuk " + distance + " km: " + fuelConsumption + "%, Sisa bahan bakar: " + remainingFuelLevel + "%");
    }

    //implementasi fitur tambahan di class abstract
    @Override
    public void stop(){
        System.out.println(getName() + " ini berhenti ketika bertemu lampu merah");
    }

    //implementasi metode refuel (double amount) dari Interface Refuelable
    @Override //
    public void refuel(double amount){
        //menambah jumlah bahan bakar ke bahan bakar terbaru
        double newFuelLevel = getFuelLevel() + amount;

        //bisa assign nilai bila telah divalidasi
        newFuelLevel = validateFuelLevel(newFuelLevel);
        setFuelLevel(newFuelLevel);
    }
    @Override
    public boolean isFuelLow() {
        return getFuelLevel() < 20;
    }
}