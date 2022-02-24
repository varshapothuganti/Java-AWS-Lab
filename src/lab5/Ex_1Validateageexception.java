package lab5;
import java.util.*;
class Ageexception extends Exception
{

	 public Ageexception(String str)
	 {
		  System.out.println(str);
		 }
}
public class Ex_1Validateageexception {
		 
		 public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter ur age :: ");
		  int age = s.nextInt();
		  
		  try {
		   if(age < 15) 
		    throw new Ageexception("Invalid age");
		   else
		    System.out.println("Valid age");
		  }
		  catch (Ageexception a) {
		   System.out.println(a);
		  }
		 }

}
