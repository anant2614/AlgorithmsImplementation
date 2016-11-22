
public class Dept {
	public static void main(String gh[]) throws CloneNotSupportedException{
		Emp emp=new Emp();
		emp.name="qqq";
		Emp emp2=(Emp) emp.clone();
		emp2.name="aaaaaa";
		System.out.println(emp.name);
		System.out.println(emp2.name);
	}
}
