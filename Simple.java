package collextion;
import java.util.*;

class Employee{
	int empno;
	String empname;
	int age;
	Employee(int empno,String empname,int age){
		this.empno=empno;
		this.empname=empname;
		this.age=age;
	}
}

class nameComparator implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		return e1.empname.compareTo(e2.empname);
	}
}
class ageComparator implements Comparator<Employee>{
	public int compare(Employee e1,Employee e3) {
		if(e1.age==e3.age) {
			return 0;
		}
		else if(e1.age>e3.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
}

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(1,"manuel",23));
		a1.add(new Employee(2,"xain",28));
		a1.add(new Employee(3,"henna",29));
		System.out.println("sorting by name");
		Collections.sort(a1,new nameComparator());
		for(Employee emp:a1) {
			System.out.println(emp.empname+" "+emp.age+" "+emp.empno);
		}
		System.out.println("sorting by age");
		Collections.sort(a1,new ageComparator());
		for(Employee emp:a1) {
			System.out.println(+emp.age+" "+emp.empname+" "+emp.empno);
		}

	}

}
