package lab1;
import java.util.*;
import java.io.*;
public class Ex_1Cubeofndigitnumber {
	public static void sumOfCubes(int num)
	{
		int k=0,cube=0;
		while(num>0)
		{
			k=num%10;
			cube=cube+k*k*k;
			num=num/10;
			
		}
		System.out.println("sumof cubes of a n digit number"+cube);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sumOfCubes(num);
	}

}
