package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
class Books{
int id;  
String name,author,publisher;  
int quantity;  
public Books(int id, String publisher, int quantity){  
    this.id = id;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}
}
class TreesetComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test tobj=new Test();
	    TreeSet<Books> set=new TreeSet<Books>(tobj);  
	    //Creating Books  
	    Books b1=new Books(101,"BPB",8);  
	    Books b5=new Books(103,"Mc Graw Hill",4);
	    Books b2=new Books(102,"cc Graw Hill",4);  
	    Books b3=new Books(101,"BPB",8);
	    Books b4=b1;
	    //Adding Books to HashSet  
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);  
	    set.add(b4);
	    set.add(b5);
	    //Traversing HashSet 
        List<Books> aList = new ArrayList(set);
	    //Comparator<Books> cmp =new Comparator();
	    Collections.sort(aList,tobj);
	    for(Books b:aList){  
	    System.out.println(b.id+" "+b.publisher+" "+b.quantity);  
	    } 
	    

	}

}
class Test implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Books b1=(Books)o1;
		Books b2=(Books)o2;
		return b2.publisher.compareTo(b1.publisher);
	}
	
}