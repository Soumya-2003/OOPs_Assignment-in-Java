/*Create a class which contains an inner class. Show that inner class can use member of outer
class directly, but Outer class can use member of Inner class only through its object. Check
the name of class file, you created. */
class OuterClass {
    private String outerMember = "Outer Class Member";
    class InnerClass {
        private String innerMember = "Inner Class Member";
        public void displayOuterMember() {
            System.out.println("Accessing from Inner Class: " + outerMember);
        }
    }
    public void displayInnerMember() {
        InnerClass inner = new InnerClass();
        System.out.println("Accessing from Outer Class: " + inner.innerMember);
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayOuterMember();
        outer.displayInnerMember();
    }
}