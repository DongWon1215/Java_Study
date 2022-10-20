package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Controller 
{
	Scanner sc = new Scanner(System.in);
	
	public void select()
	{
		try
		{
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "SCOTT","tiger");
			Statement stmt = conn.createStatement();
	
			String sql = "select * from dept";
			ResultSet rs = stmt.executeQuery(sql);
		
			System.out.println("부서 리스트를 출력합니다.");

			System.out.println("부서 리스트");
			System.out.println("--------------------------------------------");
			System.out.printf("%5s %5s %5s \n", "부서번호", "부서이름", "위치");
			System.out.println("--------------------------------------------");
		
			while(rs.next())
			{
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
		
				System.out.printf("%10d \t %10s \t %10s \n",deptno, dname, loc);
		
			}
	
			rs.close();
			stmt.close();
			conn.close();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void researchByDeptno()
	{
		try {
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "SCOTT","tiger");
			String sql = "select * from dept where deptno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sc.nextInt());
			
			ResultSet rs = pstmt.executeQuery(sql);
			
			System.out.println("검색 결과");
			System.out.println("--------------------------------------------");
                                                 
			if(rs.next())
			{
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
			
				System.out.printf("%10d \t %10s \t %010s \n", deptno, dname, loc);
			}
			
			else System.out.println("검색한 번호의 부서는 존재하지 않습니다");

			System.out.println("--------------------------------------------");
			
			rs.close();
			pstmt.close();
			conn.close();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
	}
	
	public void insert()
	{		
		System.out.println("부서 정보를 입력합니다");
		
		System.out.println("부서 번호 :");
		int deptno = Integer.parseInt(sc.nextLine());

		System.out.println("부서 명 :");
		String dname = sc.nextLine();

		System.out.println("부서 위치 :");
		String loc = sc.nextLine();
		
		try {				
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "SCOTT","tiger");
			
			if(conn != null)
			{
				System.out.println("DateBast Connection");
			}
			
			String sql = "insert into dept values (?, ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, deptno);		
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			

			int result = pstmt.executeUpdate();
			
			if(result > 0 )
				System.out.println("Complete");
			
			pstmt.close();
			conn.close();
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
	}
	
	public void update()
	{
		System.out.println("수정할 부서 정보를 입력합니다");
		
		System.out.println("수정할 부서 번호 :");
		int deptno = Integer.parseInt(sc.nextLine());

		System.out.println("수정할 부서 명 :");
		String dname = sc.nextLine();

		System.out.println("수정할 부서 위치 :");
		String loc = sc.nextLine();
		try {				
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "SCOTT","tiger");
			
			String sql = "update dept set dname = ?, loc = ? where deptno =?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.setInt(3, deptno);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0 )
				System.out.println("Update Complete");
			
			pstmt.close();
			conn.close();
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
	}
	
	public void delete()
	{		
		System.out.println("제거할 부서 정보를 입력합니다");
		
		System.out.println("제거할 부서 번호 :");
		int deptno = Integer.parseInt(sc.nextLine());
		
		try {				
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "SCOTT","tiger");
			
			if(conn != null)
			{
				System.out.println("DateBast Connection");
			}
			
			String sql = "delete from dept where deptno = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, deptno);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0 )
				System.out.println("Delete Complete");
			
			pstmt.close();
			conn.close();
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
	}
	
	public void exit()
	{
		System.exit(0);		//웹에서 사용할 경우 톰켓이 멈춰버림
	}
}
