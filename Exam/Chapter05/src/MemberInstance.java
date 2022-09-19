
public class MemberInstance 
{
	private String strName;
	private String strPhoneNumber;
	private String strMajor;
	private String strEmail;
	private String strAddress;
	private String strBirthDay;
	private int iGrade;
	
	MemberInstance(String name, String phonenum, String major, String email, int grade) 
	{
		strName = name;
		strPhoneNumber = phonenum;
		strMajor = major;
		strEmail = email;
		iGrade = grade;
	}

	MemberInstance(String name, String phonenum, String major, String email, String address, String birthday, int grade) 
	{
		strName = name;
		strPhoneNumber = phonenum;
		strMajor = major;
		strEmail = email;
		strAddress = address;
		strBirthDay = birthday;
		iGrade = grade;
	}
	
	void Introduce() 
	{
		System.out.println("�� �̸��� " + strName + " �Դϴ�");
		System.out.println("�� ��ȭ��ȣ�� " + strPhoneNumber + " �Դϴ�");
		System.out.println("�� ������ " + strMajor + " �Դϴ�");
		System.out.println("�� �г��� " + iGrade + " �Դϴ�");
		System.out.println("�� �̸��� �ּҴ� " + strEmail + " �Դϴ�");
		
		if (strBirthDay != null && strAddress != null) 
		{
			System.out.println("�� �� �ּҴ� " + strAddress + " �Դϴ�");
			System.out.println("�� ������ " + strBirthDay + " �Դϴ�");
		}
	}
}
