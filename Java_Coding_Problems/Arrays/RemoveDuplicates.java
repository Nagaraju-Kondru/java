
public class RemoveDuplicates {
    public static void main(String args[]){
        int a[]={1, 2, 3, 2, 4, 1, 5, 3};
        int b[]=new int[a.length];
        int c=0;

        for(int i=0;i<a.length;i++){
            boolean duplicate=false;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    duplicate=true;
                }
            }

            if(!duplicate){
                b[c]=a[i];
                c+=1;
            }
        }
        for(int i=0;i<c;i++){
            System.out.print(b[i]+" ");
        }

    }
}
