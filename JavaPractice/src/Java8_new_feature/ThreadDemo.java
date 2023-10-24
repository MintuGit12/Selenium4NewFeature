package Java8_new_feature;
class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child Thread by Runnable Interface");
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Runnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();//respponsible to start rum method
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread own method 2nd thread");
		}
	}

}
