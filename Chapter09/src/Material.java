
public class Material{

	String material;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() 
	{
		return super.hashCode();
	}

	@Override
	public String toString() 
	{
		return "null";
	}
	
	public static void main(String[] args) 
	{
		
		Material mt = new Material();
		
		System.out.println(mt.hashCode());
	}
	
}
