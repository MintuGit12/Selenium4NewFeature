package ExamQstn;

public class ConcurrentCount {

	public static void main(String[] args) {
	String s="AAbACCCdEEA";
	char[] ch=s.toCharArray();
	
	for(int i=0;i<ch.length;i++)
	{ 
		int count=1;
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]!=ch[j])
			{
				break;
			}
			else
				count++;
		}
		System.out.println(ch[i]+"=="+count);
		count=0;
	}
	}

}
