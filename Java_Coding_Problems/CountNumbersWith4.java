
import java.util.*;
class CountNumbersWith4 {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the Value: ");
       int n=obj.nextInt();
       int count=0;
       for(int i=0;i<=n;i++){
           int temp=i;
           while(temp>0){
               if(temp%10==4){
                   count++;
               }
               temp=temp/10;
           }
          
        }
         System.out.println("no of 4 count is: "+count);
    }
       
}
