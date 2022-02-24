package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_4StudentGoldmedal {
	public static Map<String,String> getStudents(Map<String,Integer> map)
	{
		Map<String,String> medal=new HashMap<String, String>();
		for(Map.Entry m : map.entrySet())
		{    
			    if(((int)m.getValue()>=90))
			    {
			    	medal.put((String) m.getKey(),"Gold");
			    }
			    else if((int)m.getValue()>=80 && (int)m.getValue()<90 )
			    {
			    	medal.put((String) m.getKey(),"Silver");
			    }
			    else if((int)m.getValue()>=70 && (int)m.getValue()<80 )
			    {
			    	medal.put((String) m.getKey(),"Bronze");
			    }
			    else
			    {
			    	medal.put((String) m.getKey(),"No medal");
			    }
		}  
		return medal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<String,Integer> map=new HashMap<String, Integer>();
		 map.put("2022501",90);  
		 map.put("2022502",85);    
		 map.put("2022503",70);   
		 map.put("2022504",64);   
		System.out.println(getStudents(map));

	}

}
