package exam;

public class StringChecker {
	
	boolean isNormalString(String name)
	{
		if(name.indexOf(" ") != -1)
			return false;
		
		if(name.replaceAll("[^a-z��-�R]*", "").length() != name.length())
			return false;
		
		return true;
	}
}
