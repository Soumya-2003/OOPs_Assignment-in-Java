/*Show that static block is executed at the time of class loading and also the order of execution
of these blocks (for multiple blocks/ inherited block). */
class Parent {
    static {
        System.out.println("Static Block 1 of Parent Class");
    }
    static {
        System.out.println("Static Block 2 of Parent Class");
    }
    Parent() {
        System.out.println("Constructor of Parent Class");
    }
}
class Child extends Parent {
    static {
        System.out.println("Static Block 1 of Child Class");
    }
    static {
        System.out.println("Static Block 2 of Child Class");
    }
    public Child() {
        System.out.println("Constructor of Child Class");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Inside Main Method");
        System.out.println("Creating First Object:");
        Child obj1 = new Child();
        System.out.println("Creating Second Object:");
        Child obj2 = new Child();
    }
}
