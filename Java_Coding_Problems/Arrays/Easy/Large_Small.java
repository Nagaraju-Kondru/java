class Large_Small{
    public static void main(String args[]){
        int a[]={10, 25, 5, 78, 34};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);
    }
}
