import java.util.*;
class PalindromeString{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=obj.nextLine();
        String rev="";
        String temp="";
        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        temp=rev;
        System.out.println("reversed string:"+temp);
        if(temp.equals(s)){
            System.out.println("Its a Palindrome String");
        }
        else{
            System.out.println("Not a PalindromeString");
        }
        
    }
}
