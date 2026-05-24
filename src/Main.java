public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("Toyota Camry"),
                new Car("Honda Civic"),
                new Truck("Volvo FH16", 6),
                new Truck("Scania R500", 10),
                new Bicycle("Stels Navigator"),
                new Bicycle("Forward Apache")
        };

        ServiceStation station = new ServiceStation();

        for (Vehicle vehicle : vehicles) {
            station.checkVehicle(vehicle);
            System.out.println();
        }
    }
}