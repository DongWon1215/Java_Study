
public class UserInfo 
{
	private String name;
	private String phoneNumber;
	private String eMail;
	private String address;
	private String birthDay;
	private String group;
	
	//===================Setter==============
	void setName(String name)
	{
		this.name = name;
	}
	void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	void setEMail(String eMail)
	{
		this.eMail = eMail;
	}
	void setAddress(String address)
	{
		this.address = address;
	}
	void setBirth(String birthDay)
	{
		this.birthDay = birthDay;
	}
	
	void setGroup(String group)
	{
		this.group = group;
	}
	
	//==================getter===============
	
	String getName()
	{
		return this.name;
	}
	String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	String getEMail()
	{
		return this.eMail;
	}
	String getAddress()
	{
		return this.address;
	}
	String getBirth()
	{
		return this.birthDay;
	}
	
	String getGroup()
	{
		return this.group;
	}
	
	//==================E.T.C function====================
	
	void showInfo()
	{
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNumber);
		System.out.println("�̸��� : " + eMail);
		System.out.println("�ּ� : " + address);
		System.out.println("�׷� : " + group);
		
	}
}
