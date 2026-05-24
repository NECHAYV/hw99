public class ServiceStation {

    public void checkVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            vehicle.performCheckup();
        }
    }
}