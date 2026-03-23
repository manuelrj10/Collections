import java.util.HashMap; 
class hashget
{
    public static void main(String args[]){
     HashMap<Integer,Integer> map=new HashMap<>();
      map.put(201,5);
       map.put(202,0);
        map.put(203,10); 
        System.out.println(map.get(204));
         System.out.println(map.getOrDefault(204,0));
    } 
}
