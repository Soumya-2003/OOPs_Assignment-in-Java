/*Check without having any abstract method/s whether a class can be abstract; if so, then use that concrete method/s 
from another class having main method. */
abstract class Parent{
    void display_parent(){
        System.out.println("Abstract Parent class");
    }
}
class Child extends Parent {
    void display_child() {
        System.out.println("Child class.");
    }
}

class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display_parent();
        child.display_child();
    }
}