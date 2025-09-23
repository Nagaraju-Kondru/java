class Array_FindDublicates{
    public static void main(String args[]){
        int a[]={1,2,3,4,4,1,2,5};
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    break;
                }
            }
        }
        if(count==0){
            System.out.println("No Dublicates");
        }
        else{
            System.out.println("Array contains duplicates");
        }
    }
}
