import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateTest {
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
				String sql = "update dept set dname = ?, loc = ? where deptno =?";
				
				//사용해야 될 변수가 많은 경우 
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, "사장");		//setString( ? 순서, 값)
				pstmt.setString(2, "평양");		//setString( ? 순서, 값)
				pstmt.setInt(3, 50);		//setInt( ? 순서, 값)
				
				//4. ResultSet 객체 생성
				//select의 결과를 담고있는 객체
				int result = pstmt.executeUpdate();
				
				if(result > 0 )
					System.out.println("Update Complete");
				
				ResultSet rs = pstmt.executeQuery();

				while(rs.next())
				{
//					int deptno = rs.getInt("deptno");
//					String dname = rs.getString("dname");
//					String loc = rs.getString("loc");
					int deptno = rs.getInt(1);
					String dname = rs.getString(2);
					String loc = rs.getString(3);
					
					System.out.printf("%d \t %s \t %s \n",deptno, dname, loc);
					
				}
				
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
