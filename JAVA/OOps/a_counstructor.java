
// 01 counstrector with parameter 
 class   Employes{

    String name;
    int salary;
    String add;

    Employes(String n , int s , String a){
        name = n;
        salary = s;
        add = a;
    }

    void EmpInfo(){
        System.out.println("Emp Name "+ name + " Salary " + salary + " Adress " + add);
    }
}

//02 private construdtor

class  utility{

    private utility (){
        System.out.println("private consructor");
    }

    static void showUtiliye(){
        utility obj = new utility();
    }
}

// 02 private constructor
class CalculatorP3 {

    private CalculatorP3() {
    }

    static int add(int a, int b) {
        int c = a +b;
        return c;
    }

}

// this() bydefault constructorr fill data 
class StudentP3 {

    String name;
    int age;

    StudentP3(String n, int a) {
        name = n;
        age = a;
    }

    StudentP3(String n) {   // yaha pr only name dege to age bydefault 18 upr wale constructor ko de dega
        this(n, 18);
    }

    void  StudentShowP3(){
        System.out.println("Student Name:-" + name);
        
    }
}


public  class a_counstructor{

    public static void main(String[] args){

        Employes eData = new  Employes("Aadil" , 25000 , "Ara");

        eData.EmpInfo();

        //02 private construdtor
        utility.showUtiliye();

        //02 private construdtor
        System.out.println(CalculatorP3.add(10, 20));

        StudentP3 stdP3 = new StudentP3("Aadil , 27");

        stdP3.StudentShowP3();



    }
}


// this — current object ko refer karta hai.

// this() — same class ke doosre constructor ko call karta hai.