package Java8_new_feature;
@FunctionalInterface
public interface functionalExample {
//public void m4();
public void m1();
default void m2()
{
	System.out.println("functional interaface contains default method n numbers");
}
public static void m3()
{
	System.out.println("Fuctional interface can contains any no of static methods");
}
}
@FunctionalInterface
interface Int
{
//Functional interface cannot be a marker interface	
}
@FunctionalInterface
interface Int1 extends functionalExample
{
	//it is not marker it have one abstract method
}
@FunctionalInterface
interface Int2 extends Int1
{
	public void m1();//same name as parent
}
@FunctionalInterface
interface Int3 extends Int2
{
	public void m2();//error cause of m2() not same as m1()
}
interface Int4 extends Int2
{
	public void m2();//error not cause becaus eits not functional Interface
}