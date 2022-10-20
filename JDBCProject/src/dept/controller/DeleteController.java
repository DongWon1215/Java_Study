package dept.controller;

import dept.Main;
import dept.service.DeleteService;

public class DeleteController implements Controller
{
	DeleteService service = new DeleteService();
	
	public void process()
	{
		System.out.println("������ �������� �μ� ��ȣ �Է� :");
		int deptno = Integer.parseInt(Main.sc.nextLine());
		
		int result = service.delete(deptno);
		
		if(result > 0)
			System.out.println("complete");
		else 
			System.out.println("failed");
	}
}
