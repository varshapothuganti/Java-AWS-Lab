package lab1;
import java.io.*;
import java.util.*;
public class EX_2Trafficlights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.equals("red"))
			System.out.println("stop");
		else if(s.equals("yellow"))
			System.out.println("ready");
		else if(s.equals("green"))
			System.out.println("go");

	}

}
