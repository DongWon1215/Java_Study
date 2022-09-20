
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
		System.out.println("전화 발신 중");
	}
	
	void ShowInfo()
	{
		System.out.println("제조사 :  " + color);
		System.out.println("색상 : " + company);
		System.out.println("크기 : " + size);
		System.out.println("볼륨 크기 : " + volume);
	}
}