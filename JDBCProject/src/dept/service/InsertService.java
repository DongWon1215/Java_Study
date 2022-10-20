package dept.service;

import java.sql.Connection;
import java.sql.SQLException;

import dept.dao.Dao;
import dept.dao.OracleDao;
import dept.domain.Dept;
import dept.util.ConnectionProvider;

public class InsertService {
	Dao dao = new OracleDao();
	
	public int insert(Dept dept)
	{
		int result = 0;
		Connection con = null;
		try 
		{
			con = ConnectionProvider.getConnection();
			
			result = dao.insert(con, dept);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(con != null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		return result;
	}
}
