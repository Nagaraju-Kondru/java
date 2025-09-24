

public class LeastFrequentElement {
    public static void main(String args[]){
        int a[]={1,1,2,2,3,3,4,3,2,1,5,6};
        boolean bool[]=new boolean[a.length];
        for(int i=0;i<a.length;i++){
            if(bool[i]==true){
                continue;
            }
            int count=0;
            for(int j=i+1;j<a.length;j++) {
                if (a[i] == a[j]) {
                    count++;
                    bool[j] = true;
                    bool[i]=true;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(bool[i]==false){
                System.out.println(a[i]);
            }
        }
    }
}
