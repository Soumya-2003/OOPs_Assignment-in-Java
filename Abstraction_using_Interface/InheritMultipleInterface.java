/*Create two interfaces, each with two methods. Inherit a new interface from the two, adding a
new method. Create a class by implementing the new interface and also inheriting from a
concrete class. In main (), create an object of derived class and call the methods. [do all
without package statement] */
interface Interface1 {
    void method1();
    void method2();
}
interface Interface2 {
    void method3();
    void method4();
}
interface CombinedInterface extends Interface1, Interface2 {
    void method5();
}
// Concrete base class
class BaseClass {
    void baseMethod() {
        System.out.println("Base class method executed.");
    }
}
// Derived class implementing CombinedInterface and inheriting from BaseClass
class DerivedClass extends BaseClass implements CombinedInterface {
    public void method1() {
        System.out.println("Method1 from Interface1 implemented.");
    }
    public void method2() {
        System.out.println("Method2 from Interface1 implemented.");
    }
    public void method3() {
        System.out.println("Method3 from Interface2 implemented.");
    }
    public void method4() {
        System.out.println("Method4 from Interface2 implemented.");
    }
    public void method5() {
        System.out.println("Method5 from CombinedInterface implemented.");
    }
}

class Main {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();

        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();

        obj.baseMethod();
    }
}