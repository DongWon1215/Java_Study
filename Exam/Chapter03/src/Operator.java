
public class Operator 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		recursion(0);
	}
	static void recursion(int i)
	{
		System.out.println("이건 재귀함수야");
		System.out.println(i+"번째 반복되고 있지");
		if(i > 10)
			return;
		recursion(i + 1);
		
	}
}
