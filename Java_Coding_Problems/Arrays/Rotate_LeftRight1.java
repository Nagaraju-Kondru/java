public class Rotate_LeftRight1 {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int n=a.length;
        int r=-1;
        if(r<0){
            r=r+a.length;
        }

        for(int start=0,end=a.length-1;start<end;start++,end--){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
        }
        for(int start=0,end=n-r-1;start<end;start++,end--){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
        }
        for(int start=n-r,end=n-1;start<end;start++,end--){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
        }
        for(int b:a){
            System.out.print(b+" ");
        }
    }
}
