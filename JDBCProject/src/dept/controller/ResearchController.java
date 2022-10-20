package dept.controller;

import java.util.List;
import java.util.Scanner;

import dept.domain.Dept;
import dept.service.ResearchService;

public class ResearchController  implements Controller
{
	ResearchService service = new ResearchService();
	
	public static Scanner sc = new Scanner(System.in);
	
	public void process()
	{		
		
		System.out.println("�˻� �μ� ��ȣ : ");
		int deptno = Integer.parseInt(sc.nextLine());
		Dept dept = service.research(deptno);
		
		if(dept != null)
		{
			System.out.println(dept);
		}
		else
			System.out.println("�˻� ��� ����");
	}
}
