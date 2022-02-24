package lab1;
import java.util.*;
public class Ex_8Poweroftwo {
	public static boolean checkNumber(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n&(n-1);
			count++;
		}
		if(count==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean bool=checkNumber(num);
		System.out.println(bool);

	}

}
