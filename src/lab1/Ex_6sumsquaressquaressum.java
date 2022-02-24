package lab1;
import java.util.*;
import java.lang.*;
public class Ex_6sumsquaressquaressum {
	public static int calculateDifference(int n)
	{
		int p=(n*(n+1)*(2*n+1))/6;
		int q=(int)Math.pow((n*(n+1))/2,2);
		//System.out.println(p+" "+q);
		return(p-q);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int z=calculateDifference(n);
		System.out.println(z);
		

	}

}
