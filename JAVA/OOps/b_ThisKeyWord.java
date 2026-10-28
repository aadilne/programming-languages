

class StudentP4 {

    String name;
    int age;

    // Topic 1 and 2: Using this to access current object
    void showDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Topic 3: Resolving variable name conflicts
    StudentP4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Topic 4: Calling another instance method
    void startStudy() {
        this.study();
    }

    void study() {
        System.out.println(this.name + " is studying.");
    }

    // Topic 5: Calling another constructor using this()
    StudentP4() {
        this("Unknown", 18);
    }

    // Topic 6: Passing this as an argument
    void introduce() {
        TeacherP4.showStudent(this);
    }

    // Topic 7: Returning this
    StudentP4 changeName(String newName) {
        this.name = newName;
        return this;
    }
}

class TeacherP4 {

    static void showStudent(StudentP4 student) {
        System.out.println("Teacher sees: " + student.name);
    }
}

public class b_ThisKeyWord {

    public static void main(String[] args) {

        // Topic 1: Creating an object
        StudentP4 s1 = new StudentP4("Aadil", 24);

        // Topic 2: Accessing instance variables
        s1.showDetails();

        System.out.println("---------------");

        // Topic 3: Resolving variable name conflicts
        StudentP4 s2 = new StudentP4("Rahul", 22);
        s2.showDetails();

        System.out.println("---------------");

        // Topic 4: Calling an instance method
        s1.startStudy();

        System.out.println("---------------");

        // Topic 5: Calling a constructor using this()
        StudentP4 s3 = new StudentP4();
        s3.showDetails();

        System.out.println("---------------");

        // Topic 6: Passing this as an argument
        s1.introduce();

        System.out.println("---------------");

        // Topic 7: Returning this
        s1.changeName("Aman");
        s1.showDetails();

        System.out.println("---------------");

        // Returning this allows method chaining
        s1.changeName("Rohit").showDetails();

        System.out.println("---------------");

        // Topic 8: Comparing object references
        StudentP4 s4 = s1;

        System.out.println(s1 == s4);
        System.out.println(s1 == s2);
    }
}
