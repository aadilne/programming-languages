
package Packages.companyA.companyB;


import Packages.empData.EmpDetails;




public class Employes{

    public static void main(String[] args){

        EmpDetails dObj = new EmpDetails();

        System.out.println(dObj.name);
        System.out.println(dObj.age);

        int result = dObj.add(26 , 15 );

        System.out.println(result);

        
    }
    
}