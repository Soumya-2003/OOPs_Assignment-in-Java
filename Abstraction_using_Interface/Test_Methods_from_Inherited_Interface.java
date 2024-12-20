/*Create an interface named Shape with a field pie (=3.14). Create two subclasses of it named
Circle and Rectangle. Create object of the two sub-classes, override and calculate their area.
From main() method define in a separate file test the area() methods. */
interface Shape{
    double pie = 3.14;
    double area();
}
class Circle implements Shape{
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return pie * radius * radius;
    }
}
class Rectangle implements Shape{
    private double length, breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {
        return length * breadth;
    }
}

class Main{
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 4);
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}