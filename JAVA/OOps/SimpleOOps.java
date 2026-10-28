class  Students{

    String name ;
    int age ;
    String Add;

     void  info(){
        System.out.println("Student Name:-" + name);
        System.out.println("Student Age:-" + age);
        System.out.println("Student Adress:-" + Add);

    }
}

class  CounstClass{
    String std ;
    int age;
    double fee;

    // counstrecter function class name and counstrecter should be same
    CounstClass (String n , int a , double f){
        std = n;
        age = a;
        fee = f;

    }

    void  stdName(){
        System.out.println("Student Name :-" + std);
    }

    void  stdAge(){
        System.out.println("Student Age:-" + age);
    }

    void  stdFee(){
        System.out.println("Student Fee:-" + fee);
    }
}

public  class SimpleOOps{

    public static void main(String[] args){

        Students data = new Students();
        data.name = "Aadil";
        data.age = 25;
        data.Add = "Ara";
        data.info();

        //Counstrecter based class
        CounstClass stdData = new  CounstClass ("AAdu" , 25 , 2200.45);

        stdData.stdName();
        stdData.stdAge();
        stdData.stdFee();

    }
}