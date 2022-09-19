
public class SmartPhone 
{
	
	private String color = "";
	private String company = "";
	private float size =0.f;
	private int volume =0;
	
	SmartPhone() {};
	
	SmartPhone(String color, String company, float size, int volume)
	{
		this.color = color;
		this.company = company;
		this.size = size;
		this.volume = volume;
	}
	
	void volumeUp()
	{
		volume++;
	}
	
	void volumeDown()
	{
		volume--;		
	}
	
	void call()
	{
		System.out.println("��ȭ �߽� ��");
	}
	
	void ShowInfo()
	{
		System.out.println("������ :  " + color);
		System.out.println("���� : " + company);
		System.out.println("ũ�� : " + size);
		System.out.println("���� ũ�� : " + volume);
	}
}