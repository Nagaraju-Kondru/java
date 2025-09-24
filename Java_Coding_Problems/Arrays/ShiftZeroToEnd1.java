

public class ShiftZeroToEnd1 {
    public static void main(String args[]){
        int a[]={0,1,0,2,0,0,3,4,0,5};
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[c]=a[i];
                c++;
            }
        }
        while(c<a.length){
            a[c]=0;
            c++;
        }
        for(int n:a){
            System.out.print(n+" ");
        }
    }
}
