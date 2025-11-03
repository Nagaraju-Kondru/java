class Sum_Avg{
    public static void main(String args[]){
        int a[]={10, 25, 5, 78, 34};
        int sum=0;
        int avg=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        avg=sum/a.length;
        System.out.println("sum: "+sum);
        System.out.println("avg: "+avg);
    }
}
