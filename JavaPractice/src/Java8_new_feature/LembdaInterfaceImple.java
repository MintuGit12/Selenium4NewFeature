package Java8_new_feature;
@FunctionalInterface
interface Inter
{
	public void m1();
}
@FunctionalInterface
interface I2
{
	public void m2(int a,int b);
}
@FunctionalInterface
interface I3
{
	public int m3(String str);
}
interface I4
{
	public int squareMeth(int x);
}
public class LembdaInterfaceImple {
public static void main(String[] args) {
	Inter i1=()->System.out.println("implementation of lemda exp using Functional interface");
	i1.m1();
	I2 i2=(a,b)->System.out.println("sum of the a,b is "+(a+b));
	i2.m2(10, 20);
	i2.m2(110, 220);
	I3 i3=str->str.length();
	System.out.println("1st methos is "+i3.m3("hello"));
	I3 ii3=str->str.length()+5;
	System.out.println("2nd length of string is "+ii3.m3("String"));
	I4 i4=x->x*x;//implementation of function
	System.out.println(i4.squareMeth(4));
}
}
