

public class Rotate_LeftRight {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];
        int r=-3;
        if(r<0){
            r=r+a.length;
        }
        for(int i=0;i<a.length;i++){
            b[i]=a[(i+r)%a.length];
        }
        for(int n:b){
            System.out.println(n+" ");
        }

    }
}
