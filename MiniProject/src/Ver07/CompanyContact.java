package Ver07;

public class CompanyContact extends Contact 
{
	private String company;	
	private String department;
	private String rank;
	
	CompanyContact()
	{
		
	}
	
	CompanyContact(String name, String phoneNumber, String eMail,String address,String birthDay,String group, String company,String department,String rank)
	{
		super(name, phoneNumber, eMail, address, birthDay, group);
		this.company = company;
		this.department =department;
		this.rank = rank;
	}
	
	
	public String getCompany() 
	{
		return company;
	}

	public String getDepartment() 
	{
		return department;
	}

	public String getRank() 
	{
		return rank;
	}

	public void setCompany(String company) 
	{
		this.company = company;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public void setRank(String rank) 
	{
		this.rank = rank;
	}

	@Override
	public void ShowData()
	{
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("이메일 : " + eMail) ;
		System.out.println("주소 : " + address);
		System.out.println("생일 : " + birthDay);
		System.out.println("그룹 : " + group);
		System.out.println("회사 : " + company);
		System.out.println("부서 명 : " + department);
		System.out.println("직급 : " + rank);
	}
}
