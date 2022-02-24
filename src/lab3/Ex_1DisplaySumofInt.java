package lab3;
import java.util.*;
public class Ex_1DisplaySumofInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//System.out.println(s);
		StringTokenizer st= new StringTokenizer(s," ");
		int sum=0;
		while(st.hasMoreTokens())
		{
			String s1=st.nextToken();
			//System.out.println(s1);
			sum=sum+Integer.parseInt(s1);
		}
		//System.out.println(sum);
	}

}
