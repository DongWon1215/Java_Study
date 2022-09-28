package exam;

public class StringChecker {
	
	boolean isNormalString(String name)
	{
		if(name.length() != name.trim().length())
			return false;
		
		return true;
	}
}
