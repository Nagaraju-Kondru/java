

public class ReplaceEven {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                a[i]=-1;
            }
        }
        for(int n:a){
            System.out.print(n+" ");
        }
    }
}
