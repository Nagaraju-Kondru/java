public class SwapSmallLarge {
    public static void main(String args[]){
        int a[]={3,2,1,4,5,6};
        int max=0;
        int min=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<a[min]){
                min=i;

            }
            if(a[i]>a[max]){
                max=i;
            }
        }
        int temp=a[min];
        a[min]=a[max];
        a[max]=temp;

        for(int n:a){
            System.out.print(n+" ");
        }

    }
}
