package Java8_new_feature;

public class ThreadRunnable {
public static void main(String[] args) {
	Runnable r=()->{	
		for(int i=0;i<10;i++)
		System.out.println("Child Thread....");
		//@Override
		/*public void run() {
			for(int i=0;i<10;i++)
			{
				System.out.println("child Thread..");
			}
			
		}*/

		};
	Thread t=new Thread(r);
	t.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("Main Thread..");
	}
	
}
}
