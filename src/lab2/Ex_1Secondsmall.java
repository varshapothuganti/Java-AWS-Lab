package lab2;

import java.util.Scanner;
public class Ex_1Secondsmall {
	public static int getSecondSmallest(int[] array)
	{
		int firmin=1000000009,secmin=1000000009;
		for(int i: array)
		{
			if(i<firmin)
			{
				secmin=firmin;
				firmin=i;
			}
			else if(i<secmin && i!=firmin)
				secmin=i;	
		}
		if(secmin==1000000009)
			return 1000000009;
		else
			return secmin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String val = sc.nextLine();
		String[] arr=val.split("\\s+");
		int[] array=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			array[i]=Integer.parseInt(arr[i]);
		}
		int z=getSecondSmallest(array);
		if(z==1000000009)
			System.out.println("All elements are equal");
		else
			System.out.println(z);
		
		
		

	}

}
