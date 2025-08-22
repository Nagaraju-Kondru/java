import java.util.*;
class StringBuffer_Reverse{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input=obj.nextLine();
        StringBuffer str=new StringBuffer(input);
        str.reverse();
        System.out.println("Reversed String: "+str);
        
    }
}
