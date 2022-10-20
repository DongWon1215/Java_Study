package dept.domain;


//DTO : Java Beans �������� ����
// ��� ������ private, �⺻ �����ڰ� �ݵ�� ����, getter/setter�� �ݵ�� ����
public class Dept 
{
	private int deptno;		//Į�� ��� ��ġ�����ָ� ���� spring���� ���ε��� ���� ����
	private String dname;
	private String loc;
	
	public Dept(int deptno, String dname, String loc)
	{
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	public Dept()
	{
		
	}

	public int getDeptno() {
		return deptno;
	}

	public String getDname() {
		return dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
}
