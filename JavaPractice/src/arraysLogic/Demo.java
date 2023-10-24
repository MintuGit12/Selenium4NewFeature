package arraysLogic;

public class Demo {

	public static void main(String[] args) {
		String s="aabbbccdddabbef";//a2b3c2d3a1b2e1f1
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					i++;
				}
				else
					break;
			}
			System.out.print(ch[i]+""+count);
		}

	}

}
