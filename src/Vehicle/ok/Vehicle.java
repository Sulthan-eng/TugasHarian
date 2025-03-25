package Vehicle.ok;

public abstract class Vehicle implements Refuelable {
    //fields
    private String name;
    private int speed;
    private double fuelLevel;

    //konstruktor untuk inisiaisasi fields
    public Vehicle(String name, int speed, double fuelLevel) {
        this.name = name;
        this.speed = speed;
        this.fuelLevel = validateFuelLevel(fuelLevel);  //validasi nilai bahan bakar
    }
    //Getter akan mengembalikan name, speed, fuelLevel bila dipanggil
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public double getFuelLevel() {
        return fuelLevel;
    }
    //Setter digunakan karena saya tidak bisa mengakses instansi variabel secara langsung
    public void setName(String name) {
        this.name = name; //bisa gini
    }
    public void setSpeed(int newSpeed) {
        speed = newSpeed;  //bisa juga gini
    }
    public void setFuelLevel(double newFuelLevel) {
        fuelLevel = validateFuelLevel(newFuelLevel);
    }

    //memvalidasi nilai bahan bakar yang diberikan bukan negatif dan tidak lebih dari 100
    public double validateFuelLevel(double newFuelLevel) {
        if (newFuelLevel <= 0) {
            return 0;
        } else if (newFuelLevel > 100) {
            return 100;
        } else {
            return newFuelLevel;
        }
    }

    //metode abstrak : tidak memilik body method, jadi harus diimplementasikan oleh sublass
    public abstract void move(); //kendaraan akan bergerak
    public abstract void calculateFuelConsumption(double distance); //menghitung fuel consumption dan remaining full level

    //fitur tambahan
    public abstract void stop();
}
