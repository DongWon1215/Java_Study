package dept.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dept.dao.Dao;
import dept.dao.OracleDao;
import dept.domain.Dept;
import dept.util.ConnectionProvider;

public class SelectService 
{
	// Service : �ٽ� ������ ó���ϴ� ����
	// controller ���� ��û�� ����� �����ϰ� ��ȯ
	// �ʿ��� DataBase �۾��� Dao�� ���ؼ� �۾�
	

	Dao dao = new OracleDao();
	
	public List<Dept> select()
	{
		//return dao.select(null);
		
		List<Dept> list = null;
		Connection conn = null;
		
		try 
		{
			conn = ConnectionProvider.getConnection();
		
			list = dao.select(conn);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(conn != null)
			{
				try
				{
					conn.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		return list;
		
	}
	
	
}
