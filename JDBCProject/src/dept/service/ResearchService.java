package dept.service;

import java.sql.Connection;
import java.sql.SQLException;

import dept.dao.Dao;
import dept.dao.OracleDao;
import dept.domain.Dept;
import dept.util.ConnectionProvider;

public class ResearchService 
{
	Dao dao = new OracleDao();
	
	public Dept research(int deptno)
	{
		Dept dept = null;
		Connection conn = null;
		
		try 
		{
			conn = ConnectionProvider.getConnection();
			dept = dao.researchByDeptno(conn, deptno);
		} 
		catch (SQLException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		finally
		{
			if(conn != null)
				try 
			{
					conn.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		
		return dept;
	}
}
