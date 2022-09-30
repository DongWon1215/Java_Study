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
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("이메일 : " + eMail) ;
		System.out.println("주소 : " + address);
		System.out.println("생일 : " + birthDay);
		System.out.println("그룹 : " + group);
		
	}
}
