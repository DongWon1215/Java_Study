
public class OuterClass extends Object
{
	
	// ���� Ŭ���� : Ŭ���� ���ο� �ٸ� Ŭ������ ����
	// ĸ��ȭ : Ŭ������ �ܺο� �������� �ʾƾ��Ҷ�
	// �̺�Ʈ Ŭ�������� ��κ� �̷� �������� �����Ǿ�����
	
	private String temp;
	private int num;
	
	public OuterClass(String name)
	{
		this.temp = name;
		this.num = 0;
	}
	
	public void tellYourName()
	{
		System.out.println("my name is " + this.temp);
	}
	
	class InnerClass
	{
		
		InnerClass()
		{
			tellYourName();
		}
		
	}
	
}
