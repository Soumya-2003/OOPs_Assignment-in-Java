// Write a java program to overload the constructor named with Addition() having different parameters.
class Addition{
    Addition(){
        System.out.println("Default Constructor Value: 0");
    }

    Addition(int a, int b) {
        System.out.println("Constructor with two integers: " + (a+b));
    }

    Addition(int a, int b, int c) {
        System.out.println("Constructor with two integers: " + (a+b+c));
    }

    public static void main(String[] args){
        Addition add0 = new Addition();
        Addition add2 = new Addition(5,10);
        Addition add3 = new Addition(5,10,20);
    }
}