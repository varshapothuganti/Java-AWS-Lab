package lab1;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Ex_4primenumupton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(i==2 || i==3)
				System.out.println(i);
			else 
			{
			int z=0;
			for(int j=2;j<=Math.sqrt(i)+1;j++)
			{
				if(i%j==0)
					z=1;
					
			}
			if(z==0) {
				System.out.println(i);
			}
		}

	}

}
}
