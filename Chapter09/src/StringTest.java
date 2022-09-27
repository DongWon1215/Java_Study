
public class StringTest 
{
	public static void main(String[] args) 
	{
		String str1 = "string";
		String str2 = "string";
		String str3 = new String("string");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		String str4 = String.valueOf(15);
		String str5 = "" + 5;
		System.out.println(str4);
		System.out.println(str5);
		
		System.out.println(str1.concat());
		
		System.out.println(str1.startsWith("d"));
		
		System.out.println(str1.endsWith(".txt"));

		System.out.println(str1.equals(str2));
		
		System.out.println(str1.contains("as"));
		
		System.out.println(str1.indexOf("i"));
		System.out.println(str1.lastIndexOf("n"));
		
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		System.out.println(" ".trim().isEmpty());
		
		System.out.println(str1.replace("g","g_false"));
		
	}
}
