import java.util.HashMap;
import java.util.Scanner;
class hashput1{
 
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=104;
        for(int i=101;i< n;i++){
            map.put(i,sc.nextLine());
        }
        System.out.println(map);
        System.out.println(map.get(102));
        System.out.println(map.remove(101));
        System.out.println(map.containsKey(101));
    }
}