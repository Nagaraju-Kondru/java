class Array_SecondSmallest{
    public static void main(String args[]){
        int a[]={40,60,60,50,10,1,1,2,40,10,20,9,0,50,5,2};
        int first=a[0];
        int second=a[1];
        if(a[1]<a[0]){
            first=a[1];
            second=a[0];
        }
        
        for(int i=2;i<a.length;i++){
            if(a[i]<first){
                second=first;
                first=a[i];
            }
            else if(a[i]<second&&a[i]!=first){
                second=a[i];
            }
        }
        if(first==second){
            System.out.println("no second smallest element");
        }
        else{
            System.out.println("first smallest element: "+first);
            System.out.println("Second smallest element: "+second);
        }
    }
}
