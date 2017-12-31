import java.util.Scanner;

public class Ref1 {

	public static void main(String[] args) throws Exception
	{
		// creating object in tradition way(new operator)
		A a=new A();
		System.out.println(a);
		
		// creating object by using reflection
		Scanner sc=new Scanner(System.in);
		System.out.println("enter class name:");
		String name=sc.next();
		sc.close();
		Class c=Class.forName(name);
		Object o=c.newInstance();
		System.out.println(o);
	}

}
