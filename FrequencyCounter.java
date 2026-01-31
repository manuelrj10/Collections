import java.util.HashMap;

class FrequencyCounter {
    public static void main(String[] args) {
        String word="programming";
        char[] arr=word.toCharArray();
        System.out.println(arr);
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:arr){
            map.put( ch ,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

    }
}