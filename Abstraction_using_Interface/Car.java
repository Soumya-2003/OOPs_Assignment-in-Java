/*Create a base class interface Car having three properties – number of engines=1, number of
wheels=4 and number steering=1 and two abstract methods – engine capacity and seating
capacity. Create one interface LuxuriousCar having three abstract methods – entertainment
system, number of airbags and parking sensor. Mercedes Benz is a luxurious car and Alto is
a non-luxurious car.
Design the two categories of car from another class that contains the main method. */
interface Car {
    // Default properties for all cars
    int numberOfEngines = 1;
    int numberOfWheels = 4;
    int numberOfSteering = 1;
    double engineCapacity();
    int seatingCapacity();
}
interface LuxuriousCar {
    String entertainmentSystem();
    int numberOfAirbags();
    boolean parkingSensor();
}
class MercedesBenz implements Car, LuxuriousCar {
    public double engineCapacity() {
        return 3.0;
    }
    public int seatingCapacity() {
        return 5;
    }
    public String entertainmentSystem() {
        return "Advanced 3D Surround Sound System";
    }
    public int numberOfAirbags() {
        return 6;
    }
    public boolean parkingSensor() {
        return true;
    }
    public void displayFeatures() {
        System.out.println("Mercedes Benz Features:");
        System.out.println("Number of Engines: " + numberOfEngines);
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Number of Steering: " + numberOfSteering);
        System.out.println("Engine Capacity: " + engineCapacity() + "L");
        System.out.println("Seating Capacity: " + seatingCapacity());
        System.out.println("Entertainment System: " + entertainmentSystem());
        System.out.println("Number of Airbags: " + numberOfAirbags());
        System.out.println("Parking Sensor: " + (parkingSensor() ? "Available" : "Not Available"));
    }
}
class Alto implements Car {
    public double engineCapacity() {
        return 0.8;
    }
    public int seatingCapacity() {
        return 4;
    }
    public void displayFeatures() {
        System.out.println("Alto Features:");
        System.out.println("Number of Engines: " + numberOfEngines);
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Number of Steering: " + numberOfSteering);
        System.out.println("Engine Capacity: " + engineCapacity() + "L");
        System.out.println("Seating Capacity: " + seatingCapacity());
        System.out.println("Entertainment System: Not Available");
        System.out.println("Number of Airbags: Not Available");
        System.out.println("Parking Sensor: Not Available");
    }
}

class Main {
    public static void main(String[] args) {
        MercedesBenz mercedes = new MercedesBenz();
        mercedes.displayFeatures();
        
        Alto alto = new Alto();
        alto.displayFeatures();
    }
}