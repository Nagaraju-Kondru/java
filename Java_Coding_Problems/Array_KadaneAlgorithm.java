class Array_KadaneAlgorithm{
    public static void main(String args[]){
         int a[]={-2, -3, 4, -1, -2, 1, 5, -3};
         int max=a[0];
         int sum=a[0];
         for(int i=0;i<a.length;i++){
             if(sum>=0){
                 sum+=a[i];
                 
             }
             else{
                
                 sum=a[i];
             }
             if(sum>max){
                 max=sum;
             }
         }
         System.out.println("max: "+max);
         
    }
}
