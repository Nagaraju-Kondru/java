import java.util.*;
class Find{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Value ");
        int n=obj.nextInt();
        int count=0;
        int arr[]={1, 2, 8, 10, 10, 12, 19};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<n){
                count++;
            }
        }
        if(count>0){
            System.out.println(count);
        }
        else{
            System.out.println("-1");
        }
       
    }
}
