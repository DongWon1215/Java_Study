
public class Operator 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		recursion(0);
	}
	static void recursion(int i)
	{
		System.out.println("�̰� ����Լ���");
		System.out.println(i+"��° �ݺ��ǰ� ����");
		if(i > 10)
			return;
		recursion(i + 1);
		
	}
}
