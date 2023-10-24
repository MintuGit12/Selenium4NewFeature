package Java8_new_feature;

public class LambdaExpressionRunmethod {

	public static void main(String[] args) {
	Runnable r=()->{for(int i=0;i<10;i++)//Runnable method have only one abstact method so directly implement lembda exp 
		{System.out.println("child Thread");}};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
		}
}
