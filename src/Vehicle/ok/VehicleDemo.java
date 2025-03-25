package Vehicle.ok;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new LandVehicle("Bus",120,100,4),
                new WaterVehicle("Speedboat", 80,50,true),
                new LandVehicle("Bugatti Chiron", 200,95,4),
                new WaterVehicle("Kapal Ferry", 140,23,true),
                new AirVehicle("Helikopter",200,45,true)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.calculateFuelConsumption(50);
            vehicle.stop();
            System.out.println();
        }

        //kendaraan akan diisi bahan bakar jika isFuelLow bernilai true
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isFuelLow()){
                System.out.println("Bahan bakar " + vehicle.getName() + " rendah! Mengisi ulang 30%...");
                vehicle.refuel(30);
                System.out.println("Sisa bahan bakar setelah diisi: " + vehicle.getFuelLevel() + "%" );
            }
        }

    }
}
