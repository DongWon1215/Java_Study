package dept.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dept.domain.Dept;

public class OracleDao implements Dao {

	@Override
	public List<Dept> select(Connection conn) throws SQLException {
		
		List<Dept> list = new ArrayList<>();
		String sql = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try
		{
			stmt = conn.createStatement();
		
			sql = "select * from dept";
			
			rs = stmt.executeQuery(sql);
		
			while(rs.next())
			{
				//�� ���� �����͸� Dept ��ü�� �����ϰ� list�� �߰�
				list.add(rowToDept(rs));
				//list.add(new Dept(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc")));
			}
		}
		finally 
		{
			if(rs != null)
			rs.close();
			
			if(stmt != null)
			stmt.close();
		}
		
		return list;
	}

	@Override
	public Dept researchByDeptno(Connection conn, int deptno) throws SQLException {
		
		Dept dept = null;
		String sql = "select * from dept where deptno = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try
		{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
		
			rs = pstmt.executeQuery();
                                             
			if(rs.next())
			{
				dept = rowToDept(rs);
			}
		}
		finally 
		{
			if(rs != null)
			rs.close();
			
			if(pstmt != null)
			pstmt.close();
		}
		
		return dept;
	}

	@Override
	public int insert(Connection conn, Dept dept) throws SQLException {
		
		int result = 0;
		String sql = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try
		{
		//�Է�ó��
			sql = "insert into dept values (?, ?, ?)";
		
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());		
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
		
			result = pstmt.executeUpdate();
		}
		finally 
		{
			if(rs != null)
			rs.close();
		
			if(pstmt != null)
			pstmt.close();
		}

		return result;
	}

	@Override
	public int update(Connection conn, Dept dept) throws SQLException {
		
		int result = 0;
		String sql = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try
		{
			sql = "update dept set dname = ?, loc = ? where deptno =?";
		
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
		
			result = pstmt.executeUpdate();
		}
		finally 
		{
			if(rs != null)
			rs.close();
		
			if(pstmt != null)
			pstmt.close();
		}
		
		return result;
	}

	@Override
	public int delete(Connection conn, int deptno) throws SQLException {
		
		int result = 0;
		String sql = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try
		{
			sql = "delete from dept where deptno = ?";
		
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
		
			result = pstmt.executeUpdate();
		}
		finally 
		{
			if(rs != null)
			rs.close();
		
			if(pstmt != null)
			pstmt.close();
		}
		
		return result;
	}
	
	private Dept rowToDept(ResultSet rs) throws SQLException
	{
		return new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
	}

}
