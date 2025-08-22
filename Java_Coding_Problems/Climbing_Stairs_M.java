import java.util.Scanner;
class Climbing_Stairs_M{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of stairs:");
        int n=obj.nextInt();
        int step1=1;
        int step2=1;
        int totalsteps=0;
        for(int i=0;i<n;i++){
            totalsteps=step1+step2;
            step1=step2;
            step2=totalsteps;
        }
        System.out.println("Total no of Steps Climbed: "+totalsteps);
    }
}
