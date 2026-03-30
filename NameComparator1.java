package collextion;
import java.util.*;

public class NameComparator1 implements Comparator {
	public int compare(Object o1,Object o2) {
		Employee1 e1=(Employee1)o1;
		Employee1 e2=(Employee1) o2;
		return e1.empName.compareTo(e2.empName);
		
}
}
