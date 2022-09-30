import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest 
{

//	@Override
//	public int hashCode() {
//		//0~9
//		super.hashCode();
//		return phoneNumber.charAt(phoneNumber.length() - 1 );
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		//
//		
//		if(obj != null && obj instanceof smartPhone)
//		{
//			SmartPhone phone = (SmartPhone)obj;
//			phoneNumber.equals(phone.getPhoneNumber());
//			return true;
//			
//		}
//		
//		return false;
//	}

	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		
		
		set.add("xi");
		set.add("t*pazolite");
		set.add("m2u");
		set.add("nicode");
		set.add("DJTaka");
		set.add("p*light");
		
		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator();
		
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}
