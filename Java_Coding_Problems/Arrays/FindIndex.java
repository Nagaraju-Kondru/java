public class FindIndex {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8};
        int target=3;
        int c=0;
        int index=0;
        int high=a.length-1;
        int low=0;
        int mid=0;
        while(low<=high){
            mid=(high+low)/2;
            if(target==a[mid]){
                c++;
                index=mid;
                break;
            }
            else if(target<a[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(c>0){
            System.out.println("Element fount at: "+index);
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}
