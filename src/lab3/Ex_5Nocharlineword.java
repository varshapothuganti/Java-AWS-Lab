package lab3;
import java.util.*;
public class Ex_5Nocharlineword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//System.out.println(s);
		int charcount=0, wordcount=0, linecount=0;
		StringTokenizer charc=new StringTokenizer(s," ");
		while(charc.hasMoreTokens())
		{
			charcount=charcount+1;
			//System.out.println(charcount);
			charc.nextToken();
		}
		
		StringTokenizer wordc=new StringTokenizer(s," ");
		while(wordc.hasMoreTokens())
		{
			wordcount=wordcount+1;
			wordc.nextToken();
		}
		StringTokenizer linec=new StringTokenizer(s,"\n");
		while(linec.hasMoreTokens())
		{
			linecount=linecount+1;
			linec.nextToken();
		}
		System.out.println("charcount "+charcount+"\n"+"wordcount "+wordcount+"\n"+"linecount "+linecount);

	}

}
