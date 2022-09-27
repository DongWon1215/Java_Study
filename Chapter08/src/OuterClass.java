
public class OuterClass extends Object
{
	
	// 내부 클래스 : 클래스 내부에 다른 클래스를 정의
	// 캡슐화 : 클래스를 외부에 노출하지 않아야할때
	// 이벤트 클래스들이 대부분 이런 형식으로 구성되어있음
	
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
