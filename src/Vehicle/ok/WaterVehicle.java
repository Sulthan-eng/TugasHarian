package Vehicle.ok;

//Subclass WaterVehicle mewarisi abstract class Vehicle dan mengimplementasikan interface yang memiliki fields baru
public class WaterVehicle extends Vehicle implements Refuelable{
    private boolean hasPropeller;

    //subclass konstruktor mengambil nilai args, memanggil konstruktor super dan meneruskan nilai
        public WaterVehicle(String name, int speed, double fuelLevel, boolean hasPropeller) {
        super(name, speed, fuelLevel);
        this.setHasPropeller (hasPropeller);
    }

    //Getter untuk mengembalikan field hasPropeller()
    public boolean hasPropeller() {
        return hasPropeller;
    }
    //Setter untuk field hasPropeller()
    public void setHasPropeller(boolean hasPropeller) {
        this.hasPropeller = hasPropeller;
    }

    //implementasi metode move(), penggunaan override optional
    @Override
    public void move(){
        System.out.println(getName() + " bergerak di air dengan kecepatan " + getSpeed() + " km/jam, menggunakan baling-baling: " + hasPropeller );
    }

    //implementasi metode calculateFuelConsumption(double distance
    @Override
    public void calculateFuelConsumption(double distance){
        double fuelConsumption = distance / 8;
        double remainingFuelLevel = getFuelLevel() - fuelConsumption;

        setFuelLevel(remainingFuelLevel);
        System.out.println("Konsumsi Bahan Bakar Untuk " + distance + "km: " + fuelConsumption + "%,Sisa bahan bakar: " + remainingFuelLevel + "%");
    }

    //implementasi interface Refuelable
    @Override
    public void refuel (double amount){
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
        System.out.println(getName() + " ini berhenti ketika bertemu pelabuhan");
    }

}