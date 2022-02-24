package lab2;

import java.util.Arrays;
import java.util.Scanner;
public class Ex_3ReverseSort {
	public static int[] getSorted(int[] arr,int n)
	{
		char ch;
		for(int i=0;i<n;i++)
		{
			String s=Integer.toString(arr[i]),rev="";
			//System.out.println(s+" "+s.charAt(1));
			for(int j=0;j<s.length();j++)
			{
				ch=s.charAt(j);
				rev=ch+rev;
			}
			arr[i]=Integer.parseInt(rev);
		}
		Arrays.parallelSort(arr);
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),z;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] fin=getSorted(arr,n);
		for(int k:arr)
			System.out.println(k);
	}

}

