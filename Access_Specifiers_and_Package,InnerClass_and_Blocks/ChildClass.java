/*Create a class with variable(s) and method(s) (all will be default accessed) under package
pOne. Now create a class under package pTwo, which is subclass of firstly created class. In
the method here (i.e. class of pTwo) call variable(s) and method(s) of previous class (i.e.
class of pOne). If errors come, rectify them. Now from Main (under working directory)
access second class’s members. */
package pTwo;
import pOne.ParentClass;

public class ChildClass extends ParentClass {
    public void showDetails() {
        System.out.println("Accessing data from ParentClass: " + data);
        displayData();
    }
}