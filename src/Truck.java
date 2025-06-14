public class Truck extends Vehicle {

    public Truck(String model, int wheels) {
        super(model, wheels);
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void performCheckup() {
        System.out.println("Обслуживаем грузовик: " + getModel());

        for (int i = 0; i < getWheelCount(); i++) {
            changeTire();
        }
        checkEngine();
        checkTrailer();
    }
}