
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

        // 1. Single Inheritace
        Company_BOf_ComA obj1 = new Company_BOf_ComA(25, "Aadil");
        obj1.CompanyBmtd();

        // 2. Multi Level Inheritace
        Cat catObj = new Cat();
        catObj.CatPrint();
        catObj.DogPrint();

        //3. Hierarchical Inheritance
        Child1 child1Obj = new Child1();
        child1Obj.Child1Print();

        Child2 child2Obj = new Child2();
        child2Obj.Child2Print();

        // 4. Multipule Inheritance is not supported in java. But we can achieve it through interface.
        Multipule_Child multipuleChildObj = new Multipule_Child();
        multipuleChildObj.Multipule_ChildPrint();
        multipuleChildObj.Parent2Print();

    }
}



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



// Type of inheritace.
// 1. Single Inheritace

class Company_A{

    protected String comAname;

    public Company_A(String comAname){
        this.comAname = comAname;
    }

   void  comAmtd(){
        System.out.println("Company_A Emp Name:-" + comAname);
    }
}

class Company_BOf_ComA extends Company_A{

    int comBempAge ;

    public Company_BOf_ComA (int comBempAge , String comAname ){

        super( comAname);   // Parent class constructor call
            this.comAname = comAname;
            this.comBempAge = comBempAge;
        
    }

    public void CompanyBmtd(){
        super.comAmtd();
        System.out.println("Company B of A Age: " + comBempAge);

    }

}


// 2. Multi Level Inheritace

class Cow{

    public void CowPrint(){
        System.out.println("Cow Class Boooow");
    }
}

class Dog extends Cow{

    public void DogPrint(){
        System.out.println("Dog Class Bow Bow");
    }
}

class Cat extends Dog{

    public void CatPrint(){
        System.out.println("Cat Class Meow Meow");
    }
}

//3. Hierarchical Inheritance

class Parent1{
    public void Parent1Print(){
        System.out.println("Parent1 Class");
    }
}
class Child1 extends Parent1{
    public void Child1Print(){
        System.out.println("Child1 Class");
    }
}

class Child2 extends Parent1{
    public void Child2Print(){
        System.out.println("Child2 Class");
    }
}

// 4. Multipule Inheritace is not supported in java. But we can achieve it through interface.
interface Multipule_Parent2{
     void Parent2Print(){
        System.out.println("Parent2 Class");
    }
}

interface Multipule_Parent3{

     void Parent3Print(){
        System.out.println("Parent3 Class");
    }
}

class Multipule_Child implements Multipule_Parent2, Multipule_Parent3{  // This will give error because java does not support multiple inheritace
     void Multipule_ChildPrint(){
        System.out.println("Multipule Child Class");
    }
}