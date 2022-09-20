import java.util.Scanner; 

public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Contact ui = new Contact();
		
		ui.ShowInfo();
		Scanner sc = new Scanner(System.in);
		
		/////////////////////////////////////////////////////////////
		System.out.println("이름 : "+ ui.getName());
		System.out.println("전화번호 : "+ ui.getPhoneNumber());
		System.out.println("이메일 : "+ ui.getEMail());
		System.out.println("주소 : "+ ui.getAddress());
		System.out.println("생일 : "+ ui.getBirth());
		System.out.println("그룹 : "+ ui.getGroup());
		
		//////////////////////////////////////////////////////////
		System.out.println("이름, 전화번호, 이메일, 주소, 생일, 그룹을 순서대로 입력하시오");
		ui.setName(sc.next());
		ui.setPhoneNumber(sc.next());
		ui.setEMail(sc.next());
		ui.setAddress(sc.next());
		ui.setBirth(sc.next());
		ui.setGroup(sc.next());

		ui.ShowInfo();
		sc.close();
		
		SmartPhone phone = new SmartPhone();
		
		
		
		
	}
}