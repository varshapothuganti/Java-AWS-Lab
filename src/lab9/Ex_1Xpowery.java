package lab9;
interface Power
{
	int power(int x,int y);
}

public class Ex_1Xpowery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power p=(int x,int y)->(int)(Math.pow(x,y));
		System.out.println(p.power(2 ,10));
	}

}
