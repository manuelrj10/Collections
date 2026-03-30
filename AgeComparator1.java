package collextion;
import java.util.*;

public class AgeComparator1 implements Comparator {
	public int compare(Object o1,Object o2) {
		Employee1 e1=(Employee1)o1;
		Employee1 e2=(Employee1) o2;
		if(e1.empAge==e2.empAge) {
			return 0;
		}
		else if(e1.empAge>e2.empAge) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	

}
