public class FrequencyOfElements {
    public static void main(String args[]){
        int[] arr = {2, 3, 2, 4, 3, 2, 5};
        boolean bool[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(bool[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    bool[j]=true;
                }
            }
            System.out.println("Element "+arr[i]+" occurs "+count+" times");

        }



    }
}
