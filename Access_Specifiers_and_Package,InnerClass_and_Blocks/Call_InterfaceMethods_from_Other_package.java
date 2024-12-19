/*Create an interface containing three methods, in a package ‘pkgOne’. Implement the
interface from a class under package pkgTwo. From main, under working directory, create
object of the class and call methods of interface. */
import pkgTwo.MyClass;

class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodOne();
        obj.methodTwo();
        obj.methodThree();
    }
}
