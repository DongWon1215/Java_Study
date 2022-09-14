
public class Operator 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//for(int i = 0; i < 10;i++)
		//{
		//	System.out.println(i);
		//}
		//int num = 0;
		recursion(10);
	}
	static void recursion(int i)
	{
		if(i == 0)
			return;
		//int m_iNum = i;
		System.out.println("이건 재귀함수야");
		System.out.println(i+"번째 반복되고 있지");
		//m_iNum++;
		recursion(i - 1);
		
	}
}
