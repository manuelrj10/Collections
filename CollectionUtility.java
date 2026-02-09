import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class CollectionUtility{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr.add(sc.nextInt());

        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        int count=Collections.frequency(arr, 1);//return the count of key
        System.out.println(count);
        System.out.println(Collections.binarySearch(arr, 3));//returns the index of the key
        Collections.reverse(arr);
        System.out.println(arr);
        int max=Collections.max(arr);
        System.out.println(max);
        int min=Collections.min(arr);
        System.out.println(min);
        
    }
}