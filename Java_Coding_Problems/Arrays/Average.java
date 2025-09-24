public class Average {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int sum=0;
        double avg=0;
        for(int n:a){
            sum+=n;
        }
        avg=sum/a.length;
        System.out.println("Average: "+avg);
    }
}
