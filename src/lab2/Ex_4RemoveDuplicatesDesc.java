package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_4RemoveDuplicatesDesc {
	public static int[] removeDuplicates(int[] arr,int n)
	{
		int j=0;
		int[] arr1=new int[n];
		//Arrays.fill(arr,Integer.MIN_VALUE);
		//System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++)
		{
	        if (arr[i] != arr[i + 1]) {
                arr1[j++] = arr[i];
            }
		}
        arr1[j++] = arr[n - 1];
        //System.out.println(Arrays.toString(arr1));
        for(int k=0;k<j/2;k++)
        {
            int t = arr1[k];
            arr1[k] = arr1[j- k - 1];
            arr1[j- k - 1] = t;
        }
        return arr1;
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
		int [] z=removeDuplicates(arr,n);
		for(int i=0;i<n;i++)
		{
			if(z[i]!=0)
				System.out.println(z[i]);
		}

	}

}
