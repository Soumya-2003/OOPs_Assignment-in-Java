/*Show that ordinary block is executed when object is created and also the order of execution
of these blocks (for multiple blocks/ inherited block). */
class Parent {
    static {
        System.out.println("Static Block of Parent Class");
    }
    {
        System.out.println("Instance Initializer Block of Parent Class");
    }
    public Parent() {
        System.out.println("Constructor of Parent Class");
    }
}
class Child extends Parent {
    static {
        System.out.println("Static Block of Child Class");
    }
    {
        System.out.println("Instance Initializer Block of Child Class");
    }
    public Child() {
        System.out.println("Constructor of Child Class");
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("Creating First Object:");
        Child obj1 = new Child();
        System.out.println("Creating Second Object:");
        Child obj2 = new Child();
    }
}