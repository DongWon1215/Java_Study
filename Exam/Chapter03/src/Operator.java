
public class Operator 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		recursion(3);
	}
	static void recursion(int i)
	{
		if(i < 0)
			return;
		System.out.println("이건 재귀함수야");
		System.out.println(i + "번 반복횟수가 남았지");
		recursion(i-1);
		
	}
}
