// Base class
package abstractClassesandPolymorphism;



class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Engine started.");
    }
}

// Derived class Car
class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

// Derived class Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model) {
        super(make, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla");
        Vehicle motorcycle = new Motorcycle("Harley", "Sportster");

        car.startEngine();        // Outputs: Car engine started.
        motorcycle.startEngine(); // Outputs: Motorcycle engine started.
    }
}
