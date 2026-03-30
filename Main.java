package collextion;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a1=new ArrayList<>();
		a1.add(new Employee(1, "manuel", 23));
		a1.add(new Employee(2, "xain", 28));
		a1.add(new Employee(3, "henna", 21));
		System.out.println("sorting by name");
		Collections.sort(a1, new nameComparator());
		for (Employee emp : a1) {
			System.out.println(emp.empname + " " + emp.age + " " + emp.empno);
		}
		System.out.println("sorting by age");
		Collections.sort(a1, new ageComparator());
		for (Employee emp : a1) {
			System.out.println(+emp.age + " " + emp.empname + " " + emp.empno);
		}

	}

}
