import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonEx {

	public static void main(String srahs[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		System.out.println(getObj());
		System.out.println(getObj());
	}

	public static Singleton getObj() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor(new Class[0]);
		constructor.setAccessible(true);
		Singleton foo = constructor.newInstance(new Object[0]);
		foo.print();
		return foo;
	}
}

