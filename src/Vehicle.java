public abstract class Vehicle {
    private final String model;  // Модель транспорта
    private final int wheels;    // Количество колес

    public Vehicle(String model, int wheels) {
        this.model = model;
        this.wheels = wheels;
    }

    public void changeTire() {
        System.out.println("Заменяем покрышку");
    }

    public abstract void performCheckup();

    public String getModel() {
        return model;
    }

    public int getWheelCount() {
        return wheels;
    }
}