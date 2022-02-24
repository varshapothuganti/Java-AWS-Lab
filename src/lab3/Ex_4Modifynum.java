package lab3;
import java.util.*;
import java.lang.Math.*;
public class Ex_4Modifynum {
	public static int modifyNumber(String s)
	{
		StringBuffer sb=new StringBuffer();
		int len=s.length();
		for(int i=0;i<len-1;i++)
		{
			sb.append(Math.abs((int)s.charAt(i+1)-(int)s.charAt(i)));
		}
		sb.append(s.charAt(len-1));
		String fin=sb.toString();
		//System.out.println(fin);
		return(Integer.parseInt(fin));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=Integer.toString(n);
		System.out.println(modifyNumber(s));

	}

}
