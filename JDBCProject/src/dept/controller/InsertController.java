package dept.controller;

import java.sql.Connection;

import dept.Main;
import dept.domain.Dept;
import dept.service.InsertService;

public class InsertController  implements Controller
{
	
	InsertService service = new InsertService();
	
	public void process()
	{
		System.out.println("�μ� ��ȣ : ");
		int deptno = Integer.parseInt(Main.sc.nextLine());
		System.out.println("�μ� �̸� : ");
		String dname = Main.sc.nextLine();
		System.out.println("���� : ");
		String loc = Main.sc.nextLine();
		
		int result = service.insert(new Dept(deptno,dname,loc));
	
		if(result > 0)
			System.out.println("Complete");
		else
			System.out.println("Failed");
		
	}
}
