
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
		System.out.println("�̰� ����Լ���");
		System.out.println(i + "�� �ݺ�Ƚ���� ������");
		recursion(i-1);
		
	}
}
