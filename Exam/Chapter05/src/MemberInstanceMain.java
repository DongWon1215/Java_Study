import java.util.Scanner; 
public class MemberInstanceMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		MemberInstance mi = new MemberInstance(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
		//MemberInstance mi = new MemberInstance("pykl.", ";ldgvs", "34trsdv", "pojkh", "vbmg", "qergh", 5);
		MemberInstance mi2 = new MemberInstance("asd", "cxsd", "vftb", "trhgf", 3);
		
		mi.introduce();
		System.out.println();
		mi2.introduce();
	}
	
}
