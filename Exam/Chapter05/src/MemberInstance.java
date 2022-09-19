
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
		System.out.println("제 이름은 " + strName + " 입니다");
		System.out.println("제 전화번호는 " + strPhoneNumber + " 입니다");
		System.out.println("제 전공은 " + strMajor + " 입니다");
		System.out.println("제 학년은 " + iGrade + " 입니다");
		System.out.println("제 이메일 주소는 " + strEmail + " 입니다");
		
		if (strBirthDay != null && strAddress != null) 
		{
			System.out.println("제 집 주소는 " + strAddress + " 입니다");
			System.out.println("제 생일은 " + strBirthDay + " 입니다");
		}
	}
}
