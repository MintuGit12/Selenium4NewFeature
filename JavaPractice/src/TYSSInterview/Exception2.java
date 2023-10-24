package TYSSInterview;
class TooYoung extends RuntimeException
{
	TooYoung(String s)
	{
		super(s);
	}
}
public class Exception2 {

	public static void main(String[] args) {
	if(34<60)
	{
		throw new TooYoung("its too young");
	}

	}

}
