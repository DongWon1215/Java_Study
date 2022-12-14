package Ver03;

public class CustomerContact extends Contact 
{
	private String bussinessPartnerCompany;	
	private String transactionItem;
	private String rank;
	
	CustomerContact()
	{
		
	}
	
	CustomerContact(String name, String phoneNumber, String eMail,String address,String birthDay,String group, String bussinessPartnerCompany,String transactionItem,String rank)
	{
		super(name, phoneNumber, eMail, address, birthDay, group);
		this.bussinessPartnerCompany = bussinessPartnerCompany;
		this.transactionItem =transactionItem;
		this.rank = rank;
	}
	
	
	public String getCompany() 
	{
		return bussinessPartnerCompany;
	}

	public String getDepartment() 
	{
		return transactionItem;
	}

	public String getRank() 
	{
		return rank;
	}

	public void setCompany(String company) 
	{
		this.bussinessPartnerCompany = company;
	}

	public void setDepartment(String department) 
	{
		this.transactionItem = department;
	}

	public void setRank(String rank) 
	{
		this.rank = rank;
	}

	@Override
	void ShowInfo()
	{
		super.ShowInfo();
		System.out.println("회사 : " + bussinessPartnerCompany);
		System.out.println("부서 명 : " + transactionItem);
		System.out.println("직급 : " + rank);
	}
}
