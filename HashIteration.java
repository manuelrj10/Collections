import java.util.HashMap;
import java.util.Map;
class HashIteration{
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("London",9000000);
        map.put("Paris",2100000);
        map.put("Tokyo",14000000);
        System.out.println(map.keySet());
        System.out.println(map.values());
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }
        



    }
}