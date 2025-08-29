

import java.util.*;
class ArraySum {
    static int sum=0;//instance variable share to main and fun
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the array size: ");
       int n=obj.nextInt();
       int len=n-1;
       System.out.println("Enter Array Values: ");
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=obj.nextInt();
       }   
       
       fun(len,arr);
       System.out.println("sum: "+sum);
    }
    static void fun(int len,int arr[]){
        if(len<0){
            return;
        }
        sum+=arr[len];
        fun(len-1,arr);
    }
}
