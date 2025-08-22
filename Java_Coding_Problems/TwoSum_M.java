import java.util.*;
class TwoSum_M{
     public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=obj.nextInt();
    
        int array[]=new int[size];
        
         System.out.println("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            array[i]=obj.nextInt();
        }
        System.out.println("Enter the target value:");
        int target=obj.nextInt();
        display(array,target,size);
    }
    public static void display(int array[],int target,int size){
        int sum=0;
        int i=1;

        while(i<size)  {
            sum=array[i-1]+array[i];
            if(sum==target){
                System.out.println("Two Sum Founded: "+array[i-1]+" "+array[i]);
                break;
            }
            i++;
        }
        if(sum!=target){
            System.out.println("NOt Founded Two Sum");
        }
    }
   
}
