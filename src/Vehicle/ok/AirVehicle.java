package Vehicle.ok;

public class AirVehicle extends Vehicle {
    //fields
    private boolean hasPropeller;


    //subclass konstruktor mengambil nilai args, memanggil konstruktor super dan meneruskan nilai
    public AirVehicle(String name, int speed, double fuelLevel, boolean hasPropeller) {
        super(name, speed, fuelLevel);
        this.setHasPropeller(hasPropeller);
    }

    //Getter untuk mengembalikan field hasWing
    public boolean getHasPropeller() {
        return hasPropeller;
    }


    //Setter untuk field
    public void setHasPropeller(boolean hasPropeller) {
        this.hasPropeller = hasPropeller;
    }

    @Override
    public void move() {
        System.out.println(getName() + " bergerak di udara dengan kecepatan " + getSpeed() + " km/jam, menggunakan baling-baling: " + hasPropeller);
    }

    @Override
    public void calculateFuelConsumption(double distance){
        double fuelConsumption = distance / 6;
        double remainingFuelLevel = getFuelLevel() - fuelConsumption;


        setFuelLevel(remainingFuelLevel);
        System.out.println("Konsumsi Bahan Bakar Untuk " + distance + "km: " + fuelConsumption + "%,Sisa bahan bakar: " + remainingFuelLevel + "%");
    }

    @Override
    public void refuel(double amount){
        double newFuelLevel = getFuelLevel() + amount;

        newFuelLevel = validateFuelLevel(newFuelLevel);
        setFuelLevel(newFuelLevel);
    }
    @Override
    public boolean isFuelLow(){
        return getFuelLevel() < 20;
    }
    @Override
    public void stop(){
        System.out.println(getName() + " ini berhenti ketika telah mendarat");
    }

}