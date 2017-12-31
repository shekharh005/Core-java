import java.lang.reflect.*;
import java.util.Scanner;

public class Ref2 {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter class name:");
		String name=sc.next();
		sc.close();
		
		int consCoount=0,methCount=0,fldCount=0;
		Class c=Class.forName(name);
		Constructor[] cons=c.getDeclaredConstructors();
		System.out.println("======Constructors======");
		
		for(Constructor cn:cons)
		{
			consCoount++;
			System.out.println(cn);
		}
		System.out.println("Total Constructors:"+consCoount);
		Method[] mth=c.getDeclaredMethods();
		System.out.println("======Methods======");
		for(Method m:mth)
		{
			methCount++;
			System.out.println(m);
		}
		System.out.println("Total Methods:"+methCount);
		
		Field fld[]=c.getDeclaredFields();
		System.out.println("======Fields======");
		for(Field f:fld)
		{
			fldCount++;
			System.out.println(f);
		}
		System.out.println("Total Variables:"+fldCount);
		
	}
}
