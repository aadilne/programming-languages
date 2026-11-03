// two type of Polymrophism in java
// 1. compile time polymorphism    2. Runtime Polymorphism
public class e_Polymorphism {

    public static void main(String[] args){

        System.out.println("Polymorphism Example");

        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        int compileResult =  obj.add(10 , 20);
        System.out.println("Sum of 2 numbers: " + compileResult);
   //     System.out.println("Sum of 2 numbers: " + obj.add(10, 20));
   
        System.out.println("Sum of 2 double numbers: " + obj.add(10 , 15 , 20));
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


