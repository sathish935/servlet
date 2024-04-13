package emplogin;

import java.sql.*;

public class EmployeeDao {
	
	public static int insertRecords(EmployeeLogin emp) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/jdbcdemo1";
		String username="root";
		String password="root";
		String query="insert into employee2 "+"(firstName,lastName,password,address,contact)VALUES "+"(?,?,?,?,?)";
		
		int result=0;
		
		//connection to database
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con=DriverManager.getConnection(url,username,password);
		
		PreparedStatement ptd=con.prepareStatement(query);
		
		ptd.setString(1,emp.getFirstName());
		ptd.setString(2,emp.getLastName());
		ptd.setString(3,emp.getPassword());
		ptd.setString(2,emp.getAddress());
		ptd.setString(2,emp.getContact());
		
		System.out.println(ptd);
		result=ptd.executeUpdate();
		
		return result;
	}
		//private String firstName;
//	private String lastName;
//	private String username;
//	private String password;
//	private String address;
//	private String contact;
	
//	//insert with variable
//	public static void insertVar() throws Exception {
//		String url="jdbc:mysql://localhost:3306/jdbcdemo1";
//		String username="root";
//		String password="root";
//		
//		int s_id=12;
//		String s_name="dharsan";
//		int s_ph=1234;
//		//insert into student values(12,"dharsan",1234);"
//		String query="insert into student values("  +s_id +",'"+s_name +" '," +s_ph +")";
//		
//		//connection to database
//		Connection con=DriverManager.getConnection(url,username,password);
//		Statement st=con.createStatement();
//		int rows=st.executeUpdate(query);
//		
//		System.out.println("Number of row affected:" +rows);
//		con.close();
//	}

}
