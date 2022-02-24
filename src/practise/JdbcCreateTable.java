package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcCreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Connection con = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "135790");
	         System.out.println("Opened database successfully");

	         stmt = con.createStatement();
	         String sql = "CREATE TABLE COMPANY " +
	            "(ID INT PRIMARY KEY     NOT NULL," +
	            " NAME           TEXT    NOT NULL, " +
	            " AGE            INT     NOT NULL, " +
	            " ADDRESS        CHAR(50), " +
	            " SALARY         REAL)";
	         stmt.executeUpdate(sql);
	         stmt.close();
	         con.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Table created successfully");
	      
	}

}
