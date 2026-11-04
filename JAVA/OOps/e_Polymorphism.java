// two type of Polymrophism in java
// 1. compile time polymorphism    2. Runtime Polymorphism
public class e_Polymorphism {

    public static void main(String[] args){

        System.out.println("Polymorphism Example");

        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        int compileResult =  obj.add(10 , 20);
        System.out.println("Sum of 2 numbers: " + compileResult);
   //   System.out.println("Sum of 2 numbers: " + obj.add(10, 20));
        System.out.println("Sum of 2 double numbers: " + obj.add(10 , 15 , 20));

        Truck truckObj = new Truck();  //Upcasting  Downcasting samghna hai
        truckObj.run();

        Truck carObj = new Car();
        carObj.run();

        Truck bikeObj = new Bike();
        bikeObj.run();
    }
}

// 1. compile time polymorphism
class CompileTimePolymorphism {
    // method overloading
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }
}

//2. Runtime Polymorphism
class   Truck {

   public  void run(){
        System.out.println("Truck is running"); 
}
}

class Car extends  Truck{
// @Override iska use karna jaruri hai, ye batata hai ki ye method parent class ke method ko override kar raha hai
    @Override 
    public void run(){
        System.out.println("Car is running");
    }
}

class Bike extends Truck{

    @Override 
    public  void run(){
        System.out.println("Bike is running");
    }
}

