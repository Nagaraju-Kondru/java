import java.util.*;
class Divisor{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Value");
        int n=obj.nextInt();
        Set<Integer> res=new TreeSet<>();
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                res.add(i);
                res.add(n/i);
            }
        }
       
        for(int result:res){
            System.out.print(result+" ");
        }
    }
}
