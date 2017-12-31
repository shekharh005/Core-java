import java.lang.reflect.*;
import java.util.Scanner;

public class Ref3 {

	public static void main(String[] args) throws Exception
	{
		A a=new A();
		//System.out.println(a.a); error
		
		Class c=Class.forName("A");
		Object o=c.newInstance();
		Field f=c.getDeclaredField("a");
		f.setAccessible(true);
		System.out.println(f.getInt(o));
	}
}
