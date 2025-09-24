
public class FirstNonRepeatingElement {
    public static void main(String args[]){
        int a[]={1,2,3,4,2,3,5,1,5,4};
        int target=0;
        boolean b=false;

        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]&&i!=j){
                    count++;
                }
            }
            if(count==0){
                b=true;
                System.out.println("First Non Repeating Element is: "+a[i]);
                break;
            }
        }
        if(!b){
            System.out.println("Not Found");
        }
    }
}
