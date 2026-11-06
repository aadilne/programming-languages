
class f_Abstraction{

    public static void main(String[] args) {

    System.out.println("Abstraction in java is a process of hiding the implementation details and showing only functionality to the user.");
    CarCompaney carObj = new car();
    carObj.carModel();

    CarCompaney bCompaney = new Bike();
    bCompaney.carModel();
    }
}


abstract class CarCompaney{
    abstract void carModel();
    
}

class car extends CarCompaney{
    @Override 
    
    void carModel(){
        System.out.println("Car model is BMW");
    }
}

class Bike extends CarCompaney{
    @Override
    void carModel(){
        System.out.println("Bike model is KTM");
    }
}