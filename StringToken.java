package collextion;
import java.util.*;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("The String , class is immutable : The String ; is a 'final' class .");
		StringTokenizer st=new StringTokenizer(str," :;,\'");
		List<String> lst=new ArrayList<>();
		while(st.hasMoreTokens()) {
			
			String temp=st.nextToken().toLowerCase();
			if(!lst.contains(temp)) {
				lst.add(temp);
				
			}
		}
		Collections.sort(lst);
		for(String str1:lst) {
			System.out.println(str1);
			
		}
		

	}

}
