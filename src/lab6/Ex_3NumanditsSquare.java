package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_3NumanditsSquare {
	public static Map<Integer,Integer> getSquares(int[] arr)
	{
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i],arr[i]*arr[i]);
		}
		return map;
		
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
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		map=getSquares(arr);
		System.out.println(map);

	}

}
