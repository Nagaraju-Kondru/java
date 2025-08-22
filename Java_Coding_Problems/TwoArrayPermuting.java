import java.util.*;
class TwoArrayPermuting{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=obj.nextInt();
        
        System.out.println("Enter the FirstArray: ");
        int array1[]=new int[size];
        for(int i=0;i<size;i++){
            array1[i]=obj.nextInt();
        }
        
         System.out.println("Enter the SecondArray: ");
         int array2[]=new int[size];
         for(int i=0;i<size;i++){
             array2[i]=obj.nextInt();
         }
         
         System.out.println("Enter the target Value:");
         int k=obj.nextInt();
         int sum=0;
         for(int i=0;i<size;i++){
             sum=array1[i]+array2[i];
             if(sum>=k){
                 System.out.println("Permuting Two Arrays to Meet Sum ≥ K : Yes");
                 break;
             }
         }
         if(sum<k){
             System.out.println("Permuting Two Arrays to Meet Sum not ≥ K: No");
         }
        
    }
}
