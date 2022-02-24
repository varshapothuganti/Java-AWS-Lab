/*Exercise2 Collection: Create a method that accepts a character array and count the number of times each character is present in the array.

Note: Complete this exercise on Doselect.                     [DoSelect-Lab3_4]

Method Name 	countChars
Method Description 	method that accepts a character array and count the number of times each character is present in the array.
Argument 	char[] arr
Return Type 	Map<Character, Integer>
Logic 	*/
package lab6;
import java.util.*;
public class Ex_2Charactercount {
	public static Map<Character,Integer> countChars(char[] s)
	{
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<s.length;i++)
		{
			if(map.containsKey(s[i]))
			{
				map.replace(s[i],map.get(s[i])+1);
			}
			else
				map.put(s[i], 1);
		}
		return map;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char[] s= sc.next().toCharArray();
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		map=countChars(s);
		System.out.println(map);
	}

}
