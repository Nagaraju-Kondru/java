
public class ReplaceNegatives {
    public static void main(String args[]){
        int a[]={1,-1,2,3,4,-5,7,-6};
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                a[i]=0;
            }
        }
        for(int n:a){
            System.out.print(n+" ");
        }
    }
}
