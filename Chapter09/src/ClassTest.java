import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ClassTest 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class userClass = Class.forName("Chapter09.User");
				
		System.out.println("=====================================================================");
		Field[] fieldList =  userClass.getFields();
		
		for(Field f : fieldList)
		{
			System.out.println(f.getName());
		}
		
		for(Field f : fieldList)
		{
			System.out.println(f.getName());
		}
		
		//for(Constructor<T> c : userClass.getConstructor())
		{
		//		System.out.lrintln("매개변수 개수 : " + c.getParameterCount());
		
		//		System.out.println(c.getName());
				//System.out.println(param.getName());
		}
		
	}
}
