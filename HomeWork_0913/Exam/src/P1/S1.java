package P1;

public class S1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Printmyname();

		int m_iFir = 10, m_iSec = 20;
		
		System.out.println(Add(m_iFir,m_iSec));
		System.out.println(Min(m_iFir,m_iSec));
		System.out.println(Mul(m_iFir,m_iSec));
		System.out.println(Div(m_iSec,m_iFir));
		System.out.println(Rem(m_iFir,m_iSec));
	}
	static void Printmyname()
	{
		String m_sName = "kang dong won";
		System.out.println("My name is :" + m_sName);
				
	}
	static int Add(int a, int b)
	{
		return a+b;
	}
	static int Min(int a, int b)
	{
		return a-b;
	}
	static int Mul(int a, int b)
	{
		return a*b;
	}
	static int Div(int a, int b)
	{
		return a/b;
	}
	static int Rem(int a, int b)
	{
		return a%b;
	}
}
