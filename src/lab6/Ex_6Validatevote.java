package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex_6Validatevote {
	public static ArrayList votersList(Map<String,Integer> map)
	{
		ArrayList l=new ArrayList();
		for(Map.Entry m : map.entrySet())
		{    
			    if(((int)m.getValue()>18))
			    {
			    	l.add(m.getKey());
			    }
		}  
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<String,Integer> map=new HashMap<String, Integer>();
		 map.put("Mango",19);  
		 map.put("Apple",18);    
		 map.put("Banana",17);   
		 map.put("Grapes",19);   
		 
		//System.out.println(map.get("Apple"));
		ArrayList l=new ArrayList();
		l=votersList(map);
		System.out.println(l);

	}

}
