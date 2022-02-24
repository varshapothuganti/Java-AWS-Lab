package practise;
import java.util.*;
interface Squarable
{
	int square(int n);
}
interface Concatable1
{
	String concats(String a, String b);
}
interface Oddcount
{
	int count( ArrayList<Integer> al);
}
interface Minimum
{
	int mini(ArrayList<Integer> al);
}
interface Maximum
{
	int maxi(ArrayList<Integer> al);
}
public class Lambda {
	static int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Squarable s1=(int n)->(n*n);
		System.out.println(s1.square(10));
		
		Concatable1 c1=(String a,String b)-> a+b;
		System.out.println(c1.concats("fname","lname"));
	      List<String> list=new ArrayList<String>();  
	        list.add("A");  
	        list.add("B");  
	        list.add("C");  
	        list.add("D");  
	          
	        list.forEach(  
	            (n)->System.out.println(n)  
	        );  
	        ArrayList<Integer> al=new ArrayList<Integer>();
	    	al.add(10);
	    	al.add(40);
	    	al.add(50);
	    	al.add(70);
	    	al.add(40);
	    	al.add(80);
	    	al.add(35);
	    	al.add(35);
	    	al.add(80);
	    	
	    	System.out.println("Values greater than 50");
	    	ArrayList<Integer> great=new ArrayList<Integer>();
	        al.forEach(  
		            (n)->
		            {
		            	if(n>50)
		            	{
		            		great.add(n);
		            	}
		            }
	        		); 
	        System.out.println(great);
	        System.out.println("return even numbers");
	        ArrayList<Integer> even=new ArrayList<Integer>();
	        al.forEach(  
		            (n)->
		            {
		            	if(n%2==0)
		            		even.add(n);
		            }
	        		); 
	        System.out.println(even);
	        System.out.println("odd number count");
	        Oddcount cnt=(ArrayList<Integer> a2)->
	        {
	        	a2.forEach(
	        			(n)->
	        			{
	        				if(n%2!=0)
	        					c=c+1;
	        			}
	        			);
	        	return c;
	        };
	        System.out.println(cnt.count(al));
	        System.out.println("MINI");
	        Minimum mini=(ArrayList<Integer> a2)->
	        {
	        	Collections.sort(a2);
	        	return a2.get(0);
	        };
	        System.out.println(mini.mini(al));
	        System.out.println("MAXI");
	        Maximum maxi=(ArrayList<Integer> a2)->
	        {
	        	Collections.sort(a2);
	        	return a2.get(a2.size()-1);
	        };
	        System.out.println(maxi.maxi(al));
	        
	        

	    	
	}

}
