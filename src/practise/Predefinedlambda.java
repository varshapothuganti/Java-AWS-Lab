package practise;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Predefinedlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> x1=(num)->
		{
			if(num%2==0)
				return true;
			else
				return false;
		};
		System.out.print(x1.test(10));
		Function<Integer,Integer> sq=(num)->num*num;
		System.out.println(sq.apply(10));
		int [] intArr= {12,22,32,42,52,62};
		Consumer<int[]> display =(arr)->
		{
			for(int i=0;i<intArr.length;i++) 
				System.out.println(intArr[i]+" ");
		};
		display.accept(intArr);

	}

}
