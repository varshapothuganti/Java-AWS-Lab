package practise;
import java.util.*;
class Book implements Comparable<Book>{
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String publisher, int quantity){  
    this.id = id;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}
@Override
/*public int compareTo(Book o) {
	// TODO Auto-generated method stub
	if(this.id>o.id)
		return 1;
	else if (this.id<o.id)
		return -1;
	else
		return 0;
}*/
public int compareTo(Book o) {
	return this.publisher.compareTo(o.publisher);
	
}
}

public class TreesetExampleComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    TreeSet<Book> set=new TreeSet<Book>();  
	    //Creating Books  
	    Book b1=new Book(101,"BPB",8);  
	    Book b5=new Book(103,"Mc Graw Hill",4);
	    Book b2=new Book(102,"Mc Graw Hill",4);  
	    Book b3=new Book(101,"BPB",8);
	    Book b4=b1;
	    //Adding Books to HashSet  
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);  
	    set.add(b4);
	    set.add(b5);	    //Traversing HashSet  
	    for(Book b:set){  
	    System.out.println(b.id+" "+b.publisher+" "+b.quantity);  
	    } 

	}

}

