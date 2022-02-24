package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Connection con= null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "135790");
	         con.setAutoCommit(false);
	         stmt = con.createStatement();
	         String sql = "DELETE from COMPANY where SALARY = 15000.0;";
	         stmt.executeUpdate(sql);
	         con.commit();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
	         while ( rs.next() ) {
		            int id = rs.getInt("id");
		            String  name = rs.getString("name");
		            int age  = rs.getInt("age");
		            String  address = rs.getString("address");
		            float salary = rs.getFloat("salary");
		            System.out.print( "ID = " + id );
		            System.out.print( " NAME = " + name );
		            System.out.print( " AGE = " + age );
		            System.out.print( " ADDRESS = " + address );
		            System.out.print( " SALARY = " + salary );
		            System.out.println();
		         }
		         rs.close();
		         stmt.close();
		         con.close();
	      }catch(Exception e)
	      {
	    	 e.printStackTrace(); 
	      }
	      System.out.print("Deleted succesfuuly");

	}

}
