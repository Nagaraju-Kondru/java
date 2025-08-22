import java.util.*;
class Fibnocci{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Size of Fibnocci: ");
        int size=obj.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int sum=0;
        for(int i=2;i<size;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");
        }
    }
}
