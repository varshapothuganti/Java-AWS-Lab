//Write a Java Program to validate the full name of an employee.
//Create and throw a user defined exception if firstName and lastName is blank.
package lab5;

import java.util.*;
class InvalidNameException extends Exception
{
}
class Ex_3Validatename
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the First Name:");
String fname=sc.nextLine();
System.out.println("Enter the Last Name:");
String lname=sc.nextLine();
try
{
	if(lname.equals("") || lname.equals("") )
	{
		throw new InvalidNameException();
	}
	else
		System.out.println(fname+" nfl"+lname);
}
catch(InvalidNameException e)
{
	System.out.println(e);
	System.out.println("Invalid user Name ");
}
}
}
