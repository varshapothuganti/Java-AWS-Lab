package lab1;
import java.util.*;
import java.io.*;
public class Ex_5numberdivideby3and5 {
	public static int calculateSum(int n)
	{
		int sum=0,z=5*n;
		for(int i=1;i<=z;i++)
		{
			if(n>0)
			{
				if(i%3==0 || i%5==0)
				{
					sum=sum+i;
					n-=1;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int z=calculateSum(n);
		System.out.println(z);
	}

}
