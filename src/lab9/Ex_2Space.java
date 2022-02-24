package lab9;
interface GenSpace
{
	String space(String s);
}
public class Ex_2Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenSpace sp=(String s)->(s.charAt(0)+" "+s.charAt(1));
		System.out.println(sp.space("CG"));
	}

}
