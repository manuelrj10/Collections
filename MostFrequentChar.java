import java.util.HashMap;
import java.util.Map;
class MostFrequentChar{
    public static void main(String[] args){
        String word="success";
        char[] arr=word.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=0;
        char result=' ';
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println(result);

        }
    }
