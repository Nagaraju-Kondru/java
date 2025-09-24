public class BinarySearch {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        int key=6;
        int index=-1;
        int high=a.length-1;
        int low=0;
        int mid=0;
        while(low<=high){
            mid=(high+low)/2;
            if(key==a[mid]){
                index=mid;
                break;
            }
            else if(key<a[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(index==-1){
            System.out.println("Element not found !");
        }
        else{
            System.out.println("element found at index position: "+index);
        }

    }
}
