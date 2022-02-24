package lab1;
import java.util.*;
public class Ex_7increasingnumber {
	public static boolean checkNumber(int n)
	{
		int k=n,z=0,sum=n;
		while(k>0)
		{
			z=k%10;
			if(z<=sum)
			{
				sum=z;
			}
			else
				return false;
			k=k/10;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean z=checkNumber(n);
		System.out.println(z);
		

	}

}
