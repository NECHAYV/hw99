public class Car extends Vehicle {

    public Car(String model) {
        super(model, 4);  // У автомобиля обычно 4 колеса
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void performCheckup() {
        System.out.println("Обслуживаем автомобиль: " + getModel());

        for (int i = 0; i < getWheelCount(); i++) {
            changeTire();
        }
        checkEngine();
    }
}