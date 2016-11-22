
public class Child extends Parent{

	public void printChild(){
		System.out.println("Child");
	}
	
	public void print(){
		System.out.println("Child");
	}
	
	public static void main(String as[]){
		Parent parent = new Child();
		parent.print();
	}
}
