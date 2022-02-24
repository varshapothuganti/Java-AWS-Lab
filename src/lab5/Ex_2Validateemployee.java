//Create an Exception class EmployeeException”(User defined Exception) 
//in a package named as “com.cg.eis.exception” 
//nd throw an exception if salary of an employee is below than 3000. Use Exception Handling mechanism to handle exception properly.named as “
package lab5;
import java.util.*;
class EmployeeException extends Exception
{

}
public class Ex_2Validateemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter ur salary :: ");
		  int sal = s.nextInt();
		  
		  try {
		   if(sal < 3000) 
		    throw new EmployeeException();
		   else
		    System.out.println("salis above 3000");
		  }
		  catch (EmployeeException a) {
		   System.out.println(a);
		  }

	}

}
