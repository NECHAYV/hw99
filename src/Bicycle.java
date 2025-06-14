public class Bicycle extends Vehicle {

    public Bicycle(String model) {
        super(model, 2);
    }

    @Override
    public void performCheckup() {
        System.out.println("Проверяем велосипед: " + getModel());

        for (int i = 0; i < getWheelCount(); i++) {
            changeTire();
        }
    }
}