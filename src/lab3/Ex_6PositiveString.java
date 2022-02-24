package lab3;
import java.util.*;
public class Ex_6PositiveString {
	public static boolean positiveString(char[] s)
	{
		for(int i=0;i<s.length-1;i++)
		{
			if((int)s[i]>(int)s[i+1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean b=positiveString(s.toCharArray());
		if(b)
			System.out.println("positive");
		else
			System.out.println("negative");
		
	}

}
