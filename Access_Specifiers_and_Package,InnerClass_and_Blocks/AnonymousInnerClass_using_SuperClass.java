/*Write a program to demonstrate anonymous inner class (using super class) */
class SuperClass {
    void display() {
        System.out.println("SuperClass display method");
    }
}
class MainAnonymousSuperclass {
    public static void main(String[] args) {
        SuperClass obj = new SuperClass() {
            void display() {
                System.out.println("Anonymous Inner Class extending SuperClass");
            }
        };
        // Calling the overridden method
        obj.display();
    }
}
