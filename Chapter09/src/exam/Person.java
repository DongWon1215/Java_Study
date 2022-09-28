package exam;

public class Person {
	String name;
	String personNumber;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(!(obj instanceof Person))
			return false;
		
		if(this.personNumber.indexOf("-") != -1)
			this.personNumber = this.personNumber.replace("-", "");
		
		Person object = (Person)obj;
		if(object.personNumber.indexOf("-") != -1)
			object.personNumber = object.personNumber.replace("-", "");
		
		if(!this.personNumber.equals(object.personNumber))
			return false;
		
		return true;
	}
}
