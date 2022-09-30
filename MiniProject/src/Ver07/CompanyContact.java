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
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNumber);
		System.out.println("�̸��� : " + eMail) ;
		System.out.println("�ּ� : " + address);
		System.out.println("���� : " + birthDay);
		System.out.println("�׷� : " + group);
		System.out.println("ȸ�� : " + company);
		System.out.println("�μ� �� : " + department);
		System.out.println("���� : " + rank);
	}
}
