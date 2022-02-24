package lab6;

import java.util.Scanner;
import java.util.*;
public class Ex_5SecondSmallest {
	public static int secondSmallest(int[] arr)
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			t.add((Integer)arr[i]);
		}
		

		Object[] a = new Integer[t.size()]; 
		a=t.toArray(a);
		return (int) a[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int z=secondSmallest(arr);
		System.out.println(z);

}
}
