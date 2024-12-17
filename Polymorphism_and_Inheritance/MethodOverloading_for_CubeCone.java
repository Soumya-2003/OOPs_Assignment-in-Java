//Overload the methods for class Box for cube and cone and also display its volume.
class Box {
    void calculateVolume() {
        System.out.println("No parameters, Volume cannot be calculated.");
    }

    void calculateVolume(double side) {
        double volume = Math.pow(side, 3); 
        System.out.println("Volume of cube is: " + volume);
    }

    // Method 3: For Cone (radius and height as input)
    public void calculateVolume(double radius, double height) {
        double volume = (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height; // Cone volume = (1/3)πr^2h
        System.out.println("Volume of cone is: " + volume);
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.calculateVolume();
        box.calculateVolume(3);
        box.calculateVolume(2, 5);
    }
} 
