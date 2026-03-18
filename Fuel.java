/*
Implement following inheritance 
Superclasee : Vehicle(vno, model)
SubClass 1 : Car(average)
SubClass 2: Bike(average)
Display how much fuel is require for car and bike for 400km travel

Fuel = Distance / Average
*/

class Vehicle {
    int vno;
    String model;

    Vehicle(int vno, String model) {
        this.vno = vno;
        this.model = model;
    }

    void display() {
        System.out.println("Vehicle No: " + vno);
        System.out.println("Model: " + model);
    }
}

// Subclass 1: Car
class Car extends Vehicle {
    double average;

    Car(int vno, String model, double average) {
        super(vno, model);
        this.average = average;
    }

    void calculateFuel(double distance) {
        double fuel = distance / average;
        display();
        System.out.println("Car Average: " + average + " km/l");
        System.out.println("Fuel required for " + distance + " km: " + fuel + " liters\n");
    }
}

// Subclass 2: Bike
class Bike extends Vehicle {
    double average;

    Bike(int vno, String model, double average) {
        super(vno, model);
        this.average = average;
    }

    void calculateFuel(double distance) {
        double fuel = distance / average;
        display();
        System.out.println("Bike Average: " + average + " km/l");
        System.out.println("Fuel required for " + distance + " km: " + fuel + " liters\n");
    }
}

public class Fuel {
    public static void main(String[] args) {
        
        double distance = 400; // km
        
        Car car = new Car(101, "Honda City", 20);
        Bike bike = new Bike(202, "Yamaha", 40);
        
        car.calculateFuel(distance);
        bike.calculateFuel(distance);
    }
}
