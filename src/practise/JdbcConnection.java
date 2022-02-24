package practise;

import java.sql.DriverManager;

import java.sql.Connection;

public class JdbcConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;

		try {
			
	         Class.forName("org.postgresql.Driver");
	         con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "135790");
	         if(con!=null)
	        	 System.out.print("connection success");
	         else
	        	 System.out.println("connection failed");

	}catch(Exception e)
		{
		System.out.print(e);
		}
		

}
}
