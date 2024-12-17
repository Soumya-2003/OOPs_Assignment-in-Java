/*Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance 
variable no_of_publication and experience. Now create its subclass, say Dscientist which has instance variable award. 
Put a method: public String toString () { } in every class where you describe about the class and from main create 
object of each class and print each object. */
class EMP{
    private String name;
    private int id;
    public EMP(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return "Employee Name: " + name + ", ID: " + id;
    }
}

class Scientist extends EMP{
    private int no_of_publication;
    private int experience;
    public Scientist(String name, int id, int no_of_publication, int experience) {
        super(name, id);  // Call to the superclass constructor
        this.no_of_publication = no_of_publication;
        this.experience = experience;
    }
    public String toString(){
        return super.toString() + ", Publications: " + no_of_publication + ", Experience: " + experience + " years";
    }
}

class DScientist extends Scientist{
    private String award;
    public DScientist(String name, int id, int no_of_publication, int experience, String award) {
        super(name, id, no_of_publication, experience);  // Call to the superclass constructor
        this.award = award;
    }
    public String toString(){
        return super.toString() + ", Award: " + award;
    }
}

class Main{
    public static void main(String[] args){
        EMP emp = new EMP("John Doe", 101);
        Scientist scientist = new Scientist("Alice Smith", 102, 30, 5);
        DScientist dscientist = new DScientist("Bob Johnson", 103, 50, 10, "Nobel Prize");

        System.out.println(emp);
        System.out.println(scientist);
        System.out.println(dscientist);
    }
}