//Write a java program to overload three methods named with addition() having different parameters.
class Overload3Method{
    int addition(int a, int b) {
        return a + b;
    }

    int addition(int a, int b, int c) {
        return a + b + c;
    }

    double addition(double a, double b) {
        return a + b;
    }

    public static void main(String[] args){
        Overload3Method test = new Overload3Method();
        System.out.println("Sum of two integers: " + test.addition(5,10));
        System.out.println("Sum of three integers: " + test.addition(3,4,5));
        System.out.println("Sum of two doubles: " + test.addition(2.5,3.2));
    }
}