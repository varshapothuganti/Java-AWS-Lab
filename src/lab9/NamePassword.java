package lab9;
interface Cuspassword
{
	boolean crctPassword(String x,String y);
}
public class NamePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuspassword c=(String x, String y)->
		{
			if(y.equals(x+"1234"))
				return false;
			else
				return true;
			
		};
		System.out.println(c.crctPassword("hello","hllo11234"));

	}

}
 