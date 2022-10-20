package dept.controller;

import dept.Main;
import dept.service.DeleteService;

public class DeleteController implements Controller
{
	DeleteService service = new DeleteService();
	
	public void process()
	{
		System.out.println("제거할 데이터의 부서 번호 입력 :");
		int deptno = Integer.parseInt(Main.sc.nextLine());
		
		int result = service.delete(deptno);
		
		if(result > 0)
			System.out.println("complete");
		else 
			System.out.println("failed");
	}
}
