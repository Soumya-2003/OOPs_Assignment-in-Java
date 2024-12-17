/*Create a class with a method void show () and make 3 subclasses of it and all subclasses have 
void show () method overridden and call those methods using their class references. */
class Base{
    void show(){
        System.out.println("Base Class");
    }
}
class Subclass1 extends Base{
    void show(){
        System.out.println("Subclass1");
    }
}
class Subclass2 extends Base{
    void show(){
        System.out.println("Subclass2");
    }
}
class Subclass3 extends Base{
    void show(){
        System.out.println("Subclass3");
    }
}

class Main{
    public static void main(String[] args){
        Base base = new Base();
        Base subclass1 = new Subclass1();
        Base subclass2 = new Subclass2();
        Base subclass3 = new Subclass3();

        base.show();
        subclass1.show();
        subclass2.show();
        subclass3.show();
    }
}