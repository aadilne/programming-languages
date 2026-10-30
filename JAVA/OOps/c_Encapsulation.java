
class Bank{

    private  int cash ;

    public  Bank(int cash){
        this.cash = cash;
    }

    public int   getCash(){

        System.out.println(this.cash);

        return this.cash;

    }

    public  void setCash(int bal){
        if (bal >0 ) {
            this.cash += bal;
        } else{
            System.out.println("Enter valid Cash");
        }

    }

    
}


public class c_Encapsulation {

    public  static  void  main(String[] agrs){

        Bank passBook = new  Bank(0);  // yaha 0 dalna jruri hai 

        passBook.setCash(900);

        passBook.getCash();

        
        
    }
}