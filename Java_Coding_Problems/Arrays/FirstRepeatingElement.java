
public class FirstRepeatingElement {
    public static void main(String args[]){
        int a[]={1,2,3,4,2,5,6,7,8,3,9};
        boolean b=false;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                    b=true;
                    break;
                }
            }
            if(b){
                break;
            }
        }
        if(b){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not Found");
        }

    }
}
