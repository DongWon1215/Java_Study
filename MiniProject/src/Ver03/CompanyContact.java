package Ver03;

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
	void ShowInfo()
	{
		super.ShowInfo();
		System.out.println("회사 : " + company);
		System.out.println("부서 명 : " + department);
		System.out.println("직급 : " + rank);
	}
}
