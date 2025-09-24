import java.util.LinkedHashMap;
public class FrequencyOfElements1 {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,4,3,2,1,6,1,2,1};
        LinkedHashMap<Integer,Integer> freq=new LinkedHashMap<>();
        for(int num:a){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        for(Integer key:freq.keySet()){
            Integer value=freq.get(key);
            System.out.println("Element: "+key+" count: "+value);
        }


    }
    }
