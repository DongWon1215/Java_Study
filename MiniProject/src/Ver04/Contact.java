package Ver04;

public abstract class Contact implements ShowData
{
	protected String name;
	protected String phoneNumber;
	protected String eMail;
	protected String address;
	protected String birthDay;
	protected String group;
	
	Contact()
	{
		
	}
	
	Contact(String name, String phoneNumber, String eMail,String address,String birthDay,String group)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		this.address = address;
		this.birthDay = birthDay;
		this.group = group;		
	}
	
	//===================Setter==============
	
	public void setName(String name)
	{
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public void setEMail(String eMail)
	{
		this.eMail = eMail;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setBirth(String birthDay)
	{
		this.birthDay = birthDay;
	}
	
	public void setGroup(String group)
	{
		this.group = group;
	}
	
	//==================getter===============
	
	public String getName()
	{
		return this.name;
	}
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	public String getEMail()
	{
		return this.eMail;
	}
	public String getAddress()
	{
		return this.address;
	}
	public String getBirth()
	{
		return this.birthDay;
	}
	
	public String getGroup()
	{
		return this.group;
	}
	
	//==================ETC function===============

	@Override
	public void ShowData() 
	{
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNumber);
		System.out.println("�̸��� : " + eMail) ;
		System.out.println("�ּ� : " + address);
		System.out.println("���� : " + birthDay);
		System.out.println("�׷� : " + group);
		
	}
}
