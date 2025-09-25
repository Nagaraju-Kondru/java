public class SubarrayWithGivenSum {
    public static void main(String args[]){
        int a[]={1, 4, 20, 3, 10, 5};
        int find=33;
        int sum=0;
        int s=0;
        int e=0;
        boolean bool=false;
        for(int i=0;i<a.length;i++){
            sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum==find){
                    bool=true;
                    s=i;
                    e=j;
                    break;
                }
            }
            if(bool){
                break;
            }
        }
        if(bool){
            System.out.println("Subarray found from index: "+ s +" to " +e);
        }
        else{
            System.out.println("Subarray Not Found in given array");
        }

    }
}
