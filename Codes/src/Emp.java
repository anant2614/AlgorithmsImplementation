
public class Emp implements Cloneable{

	String name;
	@Override
	public Object clone() throws CloneNotSupportedException {
		Emp cloned=(Emp) super.clone();
		return cloned;
	}
}
