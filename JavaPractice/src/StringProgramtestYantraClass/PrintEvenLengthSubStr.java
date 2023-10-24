package StringProgramtestYantraClass;

public class PrintEvenLengthSubStr {

	public static void main(String[] args) {
		String s="this is hell world";
		String[] st=s.split(" ");
		for(String s1:st)
		{
			if(s1.length()%2==0)
				System.out.println(s1);
		}
		//splliting the string
		String[] s3=s.split("i");
		for(String ss:s3)
			System.out.println(ss);
	}

}
