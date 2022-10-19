import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DelecteTest {
	public static void main(String[] args) throws ClassNotFoundException 
	{
		
		
			try {				
				//2. Connection ��ü ����
				String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
				//String dbUrl = "jdbc:MySql://@localhost:3306:project";
				Connection conn = DriverManager.getConnection(dbUrl, "SCOTT","tiger");
				
				if(conn != null)
				{
					System.out.println("DateBast Connection");
				}
				
				//3. Statement / PreparedStatement ��ü ����
				String sql = "delete from dept where deptno = ?";
				
				//����ؾ� �� ������ ���� ��� 
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, 50);		//setInt( ? ����, ��)
				
				//4. ResultSet ��ü ����
				//select�� ����� ����ִ� ��ü
				int result = pstmt.executeUpdate();
				System.out.println("������� ����?");
				
				if(result > 0 )
					System.out.println("Delete Complete");
				
//				ResultSet rs = pstmt.executeQuery();
//
//				while(rs.next())
//				{
////					int deptno = rs.getInt("deptno");
////					String dname = rs.getString("dname");
////					String loc = rs.getString("loc");
//					int deptno = rs.getInt(1);
//					String dname = rs.getString(2);
//					String loc = rs.getString(3);
//					
//					System.out.printf("%d \t %s \t %s \n",deptno, dname, loc);
//					
//				}
				
//				if(rs.next())
//				{
//					int deptno = rs.getInt(1);
//					String dname = rs.getString(2);
//					String loc = rs.getString(3);
//				
//					System.out.printf("%d \t %s \t %s \n",deptno, dname, loc);
//				}
				
				//rs.close();
				pstmt.close();
				conn.close();
			} 
			
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
	
		
	}
}
