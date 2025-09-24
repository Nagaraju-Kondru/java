public class SearchElement {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        int k=5;
        int index=0;
        boolean bool=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                bool=true;
                index=i;
            }
        }
        if(bool){
            System.out.println("Element found at: "+index);
        }
        else{
            System.out.println("Element Not Found!.");
        }
    }
}
