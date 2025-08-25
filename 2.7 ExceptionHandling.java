import java.util.*;
class Insufficent extends Exception{
    public Insufficent(String message){
        super(message);
    }
}

class ExceptionHandling{
    public static void main(String args[]){
        
        Scanner obj=new Scanner(System.in);
        int withdraw=obj.nextInt();
        int balance=1000;
        
        try{
            
            if(withdraw>balance){
                throw new Insufficent("In Sufficent Balance!..");
            }
            balance-=withdraw;
       
        }
        
        
        
        catch(Insufficent e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("Total Balance: "+balance);
        }
        
        
    }
}
