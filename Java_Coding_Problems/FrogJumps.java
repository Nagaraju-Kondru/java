import java.util.*;
class FrogJumps{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter steps:");
        int n=obj.nextInt();
        int steps=0;
        int a=1,b=2,c=4;
        if(n==1){
           steps=a; 
        }
        else if(n==2){
            steps=b;
        }
        else if(n==3){
            steps=c;
        }
        else{
            for(int i=4;i<=n;i++){
                steps=a+b+c;
                a=b;
                b=c;
                c=steps;
            }
        }
        System.out.println(steps);
    }
}
