
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
	}
}
