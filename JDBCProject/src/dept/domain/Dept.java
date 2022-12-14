package dept.domain;


//DTO : Java Beans 형식으로 정의
// 모든 변수는 private, 기본 생성자가 반드시 존재, getter/setter이 반드시 존재
public class Dept 
{
	private int deptno;		//칼럼 명과 일치시켜주면 이후 spring에서 바인딩을 쉽게 해줌
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
