package dept.controller;

import java.util.List;

import dept.dao.OracleDao;
import dept.domain.Dept;
import dept.service.SelectService;

public class SelectController  implements Controller
{
	SelectService service = new SelectService(new OracleDao());
	
	public void process()
	{
		// ������� ��û�� ó���� ���񽺷� ó�� ��û
		// �μ� ��ü ����Ʈ�� ���
		// List<Dept>
		
		List<Dept> list = service.select();
		
		if(list != null && !list.isEmpty())
		{
			for(Dept d : list)
			{
				System.out.println(d);
			}
		}
		else
			System.out.println("�˻� ��� ����");
	}
}
