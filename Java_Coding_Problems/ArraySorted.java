class ArraySorted{
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        boolean bool=true;
        
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                bool=false;
                break;
            }
        }
        if(bool){
            System.out.println("Sorted..");
        }
        else{
            System.out.println("Not Sorted..");
        }
    }
}
