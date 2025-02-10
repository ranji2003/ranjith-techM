class Car {
    private String make, model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("The engine of " + make + " " + model + " has started.");
    }
}

class ElectricCar extends Car {
    private int batteryRange;

    public ElectricCar(String make, String model, int year, int batteryRange) {
        super(make, model, year);
        this.batteryRange = batteryRange;
    }

    public void chargeBattery() {
        System.out.println("The battery is charging...");
    }
}

public class CarCode {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Toyota", "Camry", 2020),
                new ElectricCar("Tesla", "Model 3", 2021, 300)
        };

        for (Car car : cars) {
            car.startEngine();
        }
    }
}
