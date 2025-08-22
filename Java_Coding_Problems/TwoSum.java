import java.util.*;
class TwoSum{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter the Array Length: ");
        
        int arrLength=obj.nextInt();
        
        int array[]=new int[arrLength];
        
        System.out.println("Enter the Array Values: ");
        
        for(int i=0;i<arrLength;i++){
            array[i]=obj.nextInt();
        }
        
        System.out.println("Enter Target Value: ");
        int target=obj.nextInt();
        
        int i=1;
        int sum=0;
        while(i<arrLength){
            sum=array[i-1]+array[i];
            
            if(sum==target){
                System.out.println("Two Sum: "+array[i-1]+" "+array[i]);
                break;
            }
            i++;
          
        }
        if(sum!=target){
            System.out.println("Not Fing Target Value");
        }
        
    }
}
