class Person {
    protected String firstname;
    protected String secondname;

    public Person(String fname, String sname) {
        this.firstname = fname;
        this.secondname = sname;
    }

    public void printName() {
        System.out.println(firstname + " " + secondname);
    }
}

class Parent extends Person {
    public Parent(String fname, String sname) {
        super(fname, sname);
    }

    // No overriding of printName method
}

class Student extends Person {
    public Student(String fname, String sname) {
        super(fname, sname);
    }

    // No overriding of printName method
}

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Parent("John", "Doe");
        people[1] = new Student("Mary", "Doe");

        for (Person person : people) {
            person.printName(); // Calls the inherited printName method from Person
        }
    }
}
