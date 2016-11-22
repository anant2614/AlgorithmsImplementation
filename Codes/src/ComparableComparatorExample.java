import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableComparatorExample {

	public static void main(String ggh[]) {
		List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee(22, 4, "ram");
		Employee e2 = new Employee(23, 1, "shyam");
		list.add(e1);
		list.add(e2);
		Collections.sort(list);
		for (Employee employee : list) {
			System.out.println(employee.name);
		}
	}
}
