package dept.controller;

import dept.Main;
import dept.domain.Dept;
import dept.service.UpdateService;

public class UpdateController 
{
	UpdateService service = new UpdateService();
	
	public void process() 
	{
		System.out.println("������ ������ �Է��Ͻÿ�");
		int deptno = Integer.parseInt(Main.sc.nextLine());
		
		System.out.println("������ ������ �Է��Ͻÿ�");
		String dname = Main.sc.nextLine();
		
		System.out.println("������ ������ �Է��Ͻÿ�");
		String loc = Main.sc.nextLine();
		
		int result = service.update(new Dept(deptno, dname, loc));
		
		if(result > 0)
			System.out.println("complete");
		
		else
			System.out.println("failed");
	}
}
