

public class CountDuplicates {
    public static void main(String args[]){
        int a[]={1, 2, 3, 1, 2, 4, 5, 2};
        boolean b[]=new boolean[a.length];
        for(int i=0;i<a.length;i++){
            if(b[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    b[j]=true;
                }
            }
            if(count>1){
                System.out.println("Duplicate Element:"+a[i]+" count: "+count);
            }
        }
    }
}
