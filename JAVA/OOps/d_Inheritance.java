

// Parent Class
class Parent {

    // Parent class variables
    public String name;
    public int Age;

    // Parent class constructor
    public Parent(String name, int Age) {

        this.name = name;
        this.Age = Age;
    }

    // Parent class method
    public void EmpPrint() {

        System.out.println("Emp Name: " + name);
        System.out.println("Emp Age: " + Age);
    }
}

// Child Class
class Child extends Parent {

    // Child class variable
    int id;

    // Child class constructor
    public Child(int id, String name, int Age) {

        // Calling Parent class constructor
        super(name, Age);

        // Initializing Child class variable
        this.id = id;
    }

    // Child class method
    public void ChildPrint() {

        // Calling Parent class method
        super.EmpPrint();

        System.out.println("Emp ID: " + id);
    }
}

// Main Class
public class d_Inheritance {

    public static void main(String[] args) {

        // Creating Child class object
        Child obj = new Child(101, "Aadil", 24);

        // Calling Child class method
        obj.ChildPrint();

        System.out.println("----------------");

        // Accessing Parent class method through Child object
        obj.EmpPrint();
    }
}
