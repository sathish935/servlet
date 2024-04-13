import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

		private String url="jdbc:mysql://localhost:3306/jdbcdemo1";
		private String username="root";
		private String password="root";
		private String dbDriver="com.mysql.jdbc.jdbc.Driver";
		
		public void loadDriver(String dbDriver) {
			try {
				Class.forName(dbDriver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public Connection getConnection()
		{
			Connection con=null;
			
			try {
				 con=DriverManager.getConnection(url,username,password);
			}
			catch(SQLException e){
				e.printStackTrace();
				
			}
			return con;		
		}
		public String insert(Member member) {
			
			loadDriver(dbDriver);
			Connection con=getConnection();
			System.out.println("connection is "+con);
			String result="data enter successfully";
			String sql="insert into jdbcdemo1.member values(?,?,?,?)";
			try {
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, member.getUsername());
				ps.setString(2,member.getPassword());
				ps.setString(2,member.getEmail());
				ps.setString(2,member.getContact());
				
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result="Data not entered";
			}
			
			return result;
			
		}
		
}
