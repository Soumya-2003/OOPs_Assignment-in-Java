//Overload the constructors for class Box for cube and cone and also display its volume.
class Box{
    private double volume;
    Box(){
        volume = 0.0;
        System.out.println("Volume for default constructor: " + volume);
    }

    Box(double side){
        volume = Math.pow(side, 3);
        System.out.println("Volume for cube: " + volume);
    }

    Box(double radius, double height){
        volume = (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume for cone: " + volume);
    }

    public static void main(String[] args) {
        // Default constructor
        Box defaultBox = new Box();

        // Cube constructor (side length = 3)
        Box cube = new Box(3);

        // Cone constructor (radius = 2, height = 5)
        Box cone = new Box(2, 5);
    }
}