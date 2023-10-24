package TYSSInterview;

public class ImportentSorting {

	public static void main(String[] args) {
		String st="AAbACCCbdEEEAA";
		for(int i=0;i<st.length();i++)
		{
			int count=1;
			for(int j=i+1;j<st.length();j++)
			{
				if(st.charAt(i)==st.charAt(j))
				{
					count++;
					i++;
				}
				else
					break;
			}
			System.out.println(st.charAt(i)+" is occured "+count);
		}
	}

}
