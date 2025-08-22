import java.util.*;
class Climbing_Stairs{
    public static int display(int n){
        if(n<=1){
            return 1;
        }
        int step1=1;
        int step2=1;
        int totalsteps=0;
        for(int i=0;i<n;i++){
            totalsteps=step1+step2;
            step1=step2;
            step2=totalsteps;
        }
        return totalsteps;
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no of Steps: ");
        int n=obj.nextInt();
        System.out.println("Total Steps Climbed: "+display(n));
    }
}
