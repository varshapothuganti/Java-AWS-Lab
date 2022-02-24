package lab1;
import java.io.*;
import java.util.*;
public class Ex_3Fibinoacci {
	public static int fib(int n)
	{
		int a=1,b=1;
		if(n==1 || n==2)
			return 1;
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=1;
		int answer=fib(n);
		System.out.println("n th term of fiboacci is"+answer);
	}

}
