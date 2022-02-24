package lab6;
import java.util.*;
public class Ex_1SortbyValuehm {
	@SuppressWarnings("unchecked")
	public static List getValues(Map map)
	{
	    List l=new LinkedList();
	    Set set=map.entrySet(); 
	    Iterator itr=set.iterator();
	    
	    while(itr.hasNext()){  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        l.add(entry.getValue());  
	    }  
	    Collections.sort(l);
	    return l;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");  
	      List l=new LinkedList();
	      l=getValues(map);
	      System.out.println(l);

	}

}
