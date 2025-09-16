import java.util.*;
class Array_CountFrequency{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int arr[]={10, 20, 10, 5, 20};
        Map<Integer,Integer> num=new TreeMap<>();
         for(int n:arr){
             num.put(n,num.getOrDefault(n,0)+1);
         }
         
         List<List<Integer>> result=new ArrayList<>();
         for(Map.Entry<Integer,Integer> entry:num.entrySet()){
             result.add(Arrays.asList(entry.getValue(),entry.getKey()));
         }
         System.out.println(result);
    }
}
