package lab3;
import java.util.*;
public class Ex_3Replaceconso {
	 static boolean isVowel(char ch)
	    {
	        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o'
	            && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O'
	            && ch != 'U') {
	            return false;
	        }
	        return true;
	    }

	    static String replaceConsonants(char []  s)
	    {

	        for (int i = 0; i < s.length; i++) {
	            if (!isVowel(s[i])) {
	 

	                if (s[i] == 'z') {
	                    s[i] = 'b';
	                }
	                if (s[i] == 'Z') {
	                    s[i] = 'B';
	                }
	                else {
	 

	                    s[i] = (char)(s[i] + 1);

	                    if (isVowel(s[i])) {
	                        s[i] = (char)(s[i] + 1);
	                    }
	                }
	            }
	        }
	        return String.valueOf(s);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(replaceConsonants(s.toCharArray()));
	}

}
