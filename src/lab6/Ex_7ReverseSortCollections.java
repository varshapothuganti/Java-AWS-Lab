package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex_7ReverseSortCollections {
	public static ArrayList getSorted(ArrayList arr)
	{
		char ch;
		for(int i=0;i<arr.size();i++)
		{
			String s=Integer.toString((int) arr.get(i)),rev="";
			//System.out.println(s+" "+s.charAt(1));
			for(int j=0;j<s.length();j++)
			{
				ch=s.charAt(j);
				rev=ch+rev;
			}
			arr.set(i,Integer.parseInt(rev));
		}
		Collections.sort(arr);
		return arr;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),z;
		ArrayList arr=new ArrayList();
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		System.out.println(getSorted(arr));


	}

}
