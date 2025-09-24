
public class ShiftZerosToEnd {
    public static void main(String args[]){
        int a[]={0,1,0,2,0,0,3,4,0,5};
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[c];
                a[c]=temp;
                c++;
            }
        }
        for(int n:a){
            System.out.print(n+" ");
        }
    }
}
