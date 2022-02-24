package lab2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class Ex_2SortStrings {
	public static String sortStrings(String [] arr,int n)
	{
		Arrays.sort(arr);
		int z;
		if(n%2==0)
			z=n/2;
		else
			z=n/2+1;
		for(int i=0;i<n;i++)
		{
			if(i<z)
				arr[i]=arr[i].toUpperCase();
			else
				arr[i]=arr[i].toLowerCase();
				
		}
		return(Arrays.toString(arr));	
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		String s=sortStrings(arr,n);
		System.out.println(s);
	}

}
