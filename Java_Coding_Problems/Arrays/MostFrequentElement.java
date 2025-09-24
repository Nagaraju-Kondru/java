
public class MostFrequentElement{
    public static void main(String args[]){
        int a[] = {1, 2, 3, 2, 4, 2, 5, 3, 1,1};
        boolean bool[]=new boolean[a.length];
        int maxValue=0;
        int element=0;

        for(int i=0;i<a.length;i++){
            if(bool[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    bool[j]=true;
                    count++;
                }
                if(maxValue<count){
                    maxValue=count;
                   
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(bool[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<a.length;j++){

                if(a[i]==a[j]){
                    count++;
                    bool[i]=true;
                }
                if(count==maxValue){
                    element=a[i];
                    System.out.println("element: "+element+" has highest count is : "+maxValue);
                    break;
                }
            }
        }
    }
}
