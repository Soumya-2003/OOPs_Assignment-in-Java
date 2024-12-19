/*Write a program to demonstrate anonymous inner class (using interface) */
interface MyInterface {
    void show();
}

class MainAnonymousInterface {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {
            @Override
            public void show() {
                System.out.println("Anonymous Inner Class implementing MyInterface");
            }
        };
        obj.show();
    }
}