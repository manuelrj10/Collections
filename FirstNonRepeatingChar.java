
import java.util.HashMap;
//import java.util.Map;
class FirstNonRepeatingChar{
    public static void main(String args[]){
        String word="swiss";
        char[] arr=word.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:arr){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
       for(char ch:arr){
        if(map.get(ch)==1){
            System.out.println(ch);
            break;
        }
       }
       
       
    }
}