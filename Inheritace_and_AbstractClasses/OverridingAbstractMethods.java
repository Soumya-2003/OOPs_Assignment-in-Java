/*Create an abstract class with three abstract methods check whether you can we override only few methods 
(not all methods) in subclass or not. */
abstract class AbstractClass {
    abstract void methodOne();
    abstract void methodTwo();
    abstract void methodThree();
}
abstract class PartialSubclass extends AbstractClass {
    void methodOne() {
        System.out.println("Method One is implemented in PartialSubclass.");
    }
}
class ConcreteSubclass extends PartialSubclass {
    void methodTwo() {
        System.out.println("Method Two is implemented in ConcreteSubclass.");
    }
    void methodThree() {
        System.out.println("Method Three is implemented in ConcreteSubclass.");
    }
}

class Main {
    public static void main(String[] args) {
        // Cannot instantiate an abstract class
        // AbstractClass obj = new AbstractClass(); // Compilation Error
        // PartialSubclass obj = new PartialSubclass(); // Compilation Error

        // Create an instance of the concrete subclass
        ConcreteSubclass obj = new ConcreteSubclass();

        // Call the methods
        obj.methodOne();
        obj.methodTwo();
        obj.methodThree();
    }
}