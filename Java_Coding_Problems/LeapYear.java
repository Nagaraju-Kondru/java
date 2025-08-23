import java.util.*;
class LeapYear{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year=obj.nextInt();
         if(year%400==0||(year%4==0&&year%100!=0)){
            System.out.println("Leap Year:"+year);
        }
        else{
            System.out.println("Not Leap Year: "+year);
        }
    }
}
