
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
		System.out.println("�̰� ����Լ���");
		System.out.println(i+"��° �ݺ��ǰ� ����");
		//m_iNum++;
		recursion(i - 1);
		
	}
}
