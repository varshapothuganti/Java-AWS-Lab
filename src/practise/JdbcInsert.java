package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Connection con = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
	            "postgres", "135790");
	         con.setAutoCommit(false);
	         stmt = con.createStatement();
	         String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (1, 'AMAR', 32, 'Hyderabad', 20000.00 );";
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (2, 'Arav', 25, 'Banglore', 15000.00 );";
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (3, 'Arun', 23, 'Chennai', 20000.00 );";
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (4, 'Ajay', 25, 'Noida ', 65000.00 );";
	         stmt.executeUpdate(sql);
	         stmt.close();
	         con.commit();
	         con.close();
	      }catch(Exception e)
	      {
	    	  System.err.println(e);
	      }
	      System.out.println("Records created");

	}

}
