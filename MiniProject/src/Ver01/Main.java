package Ver01;
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
		
		ui.ShowInfo();
		
		sc.close();
	}
}