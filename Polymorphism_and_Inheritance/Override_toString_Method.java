/*Create a class Student containing instance variables roll and name and a parameterized constructor. 
Create two objects of that class from the main class and print them (Hints: Override toString method of Object class).*/
class Student {
    // Instance variables
    private int roll;
    private String name;

    // Parameterized constructor
    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    
    //@Override
    public String toString() {
        return "Roll Number: " + roll + ", Name: " + name;
    }
}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(102, "Bob");
        System.out.println(student1);
        System.out.println(student2);
    }
}
