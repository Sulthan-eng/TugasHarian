package Vehicle.ok;

//Class
public class LandVehicle extends Vehicle implements Refuelable {
    //new fields
    private int wheels; //jumlah roda

    //subclass konstruktor mengambil nilai args, memanggil konstruktor super dan meneruskan nilai
    public LandVehicle(String name, int speed, double fuelLevel, int wheels) {
        super(name, speed, fuelLevel);
        this.wheels = wheels;
    }

    //implementasi metode move(), @override optional
    public void move(){
        System.out.println(getName() + " bergerak di darat dengan " + wheels + " roda pada kecepatan " + getSpeed() + " km/jam");
    }

    //implementasi metode calculateFuelConsumption(double distance), @override optional
    public void calculateFuelConsumption(double distance){
        double fuelConsumption = distance / 10;
        double remainingFuelLevel = getFuelLevel() - fuelConsumption;

        setFuelLevel(remainingFuelLevel);
        System.out.println("Konsumsi Bahan Bakar Untuk " + distance + " km: " + fuelConsumption + "%, Sisa bahan bakar: " + remainingFuelLevel + "%");
    }

    //implementasi metode refuel (double amount) dari Interface Refuelable
    @Override
    public void refuel(double amount){
        double newFuelLevel = getFuelLevel() + amount;

        newFuelLevel = validateFuelLevel(newFuelLevel);
        setFuelLevel(newFuelLevel);
    }
    @Override
    public boolean isFuelLow() {
        return getFuelLevel() < 20;
    }

    @Override
    public void stop(){
        System.out.println(getName() + " ini berhenti ketika bertemu lampu merah");
    }

}