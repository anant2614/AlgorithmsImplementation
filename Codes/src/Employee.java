
public class Employee implements Comparable<Employee>{

	int age;
	String name;
	int id;
	
	public Employee(int age,int id,String name){
		this.age=age;
		this.id=id;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Employee paramT) {
		return this.age-paramT.age;
	}

	
}
