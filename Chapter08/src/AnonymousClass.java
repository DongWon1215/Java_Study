
public class AnonymousClass {
	private String name;
	
	AnonymousClass(String name)
	{
		this.name = name;
	}
	
	
	// �͸� Ŭ���� : �̸����� ���ǵǴ� Ŭ����
	// �ѹ� �ν��Ͻ� ���� �� �� ��� ���� ����� ��� ���
	// new �߻� Ŭ����() { �߻�޼ҵ� ���� };
	// new �������̽� () { �߻� �޼ҵ� ���� };
	class LocalClass extends BasicClass
	{
		return new BasicClass() 
				{
					void tell()
					{
						System.out.println("Hello" + name);
					}
				};
	}
}
