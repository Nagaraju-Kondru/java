import java.util.*;
class String_Reverse_M{
    public static String display(String str){
        String rev="";
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=obj.nextLine();
        System.out.println("Reversed String is:"+display(str));

    }
}
