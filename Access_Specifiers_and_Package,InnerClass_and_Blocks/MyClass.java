/*Create an interface containing three methods, in a package ‘pkgOne’. Implement the
interface from a class under package pkgTwo. From main, under working directory, create
object of the class and call methods of interface. */
package pkgTwo;
import pkgOne.MyInterface;

public class MyClass implements MyInterface {
    public void methodOne() {
        System.out.println("Method One from MyClass.");
    }
    public void methodTwo() {
        System.out.println("Method Two from MyClass.");
    }
    public void methodThree() {
        System.out.println("Method Three from MyClass.");
    }
}