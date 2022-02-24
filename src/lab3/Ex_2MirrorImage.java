package lab3;
import java.util.*;
public class Ex_2MirrorImage {
	public static String getImage(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		return(s+"|"+sb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(getImage(s));

	}

}
