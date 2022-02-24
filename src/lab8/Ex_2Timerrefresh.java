package lab8;
import java.time.LocalTime;
class MyThread extends Thread
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			  LocalTime time = LocalTime.now();  
			   System.out.println(time); 
			   try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
		}
		
	}
	
}
public class Ex_2Timerrefresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		mt.start();
	}

}
