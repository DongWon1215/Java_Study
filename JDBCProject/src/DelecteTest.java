import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DelecteTest {
	public static void main(String[] args) throws ClassNotFoundException 
	{
		
		
			try {				
				//2. Connection 객체 생성
				String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
				//String dbUrl = "jdbc:MySql://@localhost:3306:project";
				Connection conn = DriverManager.getConnection(dbUrl, "SCOTT","tiger");
				
				if(conn != null)
				{
					System.out.println("DateBast Connection");
				}
				
				//3. Statement / PreparedStatement 객체 생성
				String sql = "delete from dept where deptno = ?";
				
				//사용해야 될 변수가 많은 경우 
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, 50);		//setInt( ? 순서, 값)
				
				//4. ResultSet 객체 생성
				//select의 결과를 담고있는 객체
				int result = pstmt.executeUpdate();
				System.out.println("여기까지 오냐?");
				
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
