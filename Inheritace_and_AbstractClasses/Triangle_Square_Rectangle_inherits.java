/*Create a base class TwoD that contains two instance variable length and breadth and a method area(). 
Three subclasses triangle, square and rectangle inherits the base class TwoD and override the method area() 
according to their shape. */
class TwoD{
    protected double length, breadth;
    TwoD(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double area(){
        return 0;
    }
}
class Triangle extends TwoD{
    Triangle(double base, double height){
        super(base, height);
    }
    public double area(){
        return 0.5 * length * breadth;
    }
}
class Square extends TwoD{
    Square(double side){
        super(side, side);
    }
    public double area(){
        return length * length;
    }
}
class Rectangle extends TwoD{
    Rectangle(double length, double breadth){
        super(length, breadth);
    }
    public double area() {
        return length * breadth;
    }
}

class Main{
    public static void main(String[] args){
        TwoD triangle = new Triangle(10, 5);
        TwoD square = new Square(4);
        TwoD rectangle = new Rectangle(8, 6);

        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}