//Create a class and test if method overloading holds good for return type of method or not.
class MethodOverloadingTest{
    void display(int a){
        System.out.println("Method with int parameter: " + a);
    }

    /*int display(int a){
        return a;
    }*/

   void display(double a){
    System.out.println("Method with double parameter: " + a);
   }

    public static void main(String[] args){
        MethodOverloadingTest test = new MethodOverloadingTest();
        test.display(5);
        test.display(5.2);
    }
}