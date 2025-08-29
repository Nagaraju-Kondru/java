import java.util.*;
class PrimeNumber{
    static int count=0;
    public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the Value to Check Prime:");
       int n=obj.nextInt();
       int temp=n;
       prime(n,temp);
       if(count<3){
           System.out.println("Prime Number");
       }
       else{
           System.out.println("Not Prime Number");
       }
       
    }
    static void prime(int n,int temp){
        if(n<1){
            return;
        }
       
        if(temp%n==0){
            count++;
        }
        prime(n-1,temp);
    }
}
