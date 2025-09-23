class Array_MergeTwoArrays{
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int n=a.length+b.length;
        int arr[]=new int[n];
        
        for(int i=0;i<a.length;i++){
            arr[i]=a[i];
        }
        
        for(int i=0;i<b.length;i++){
            arr[a.length+i]=b[i];
        }
        for(int newarr:arr){
            System.out.print(newarr+" ");
        }
    }
}
