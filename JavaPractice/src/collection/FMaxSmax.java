package collection;

public class FMaxSmax {

	public static void main(String[] args) {
		int[] arr= {56,12,34,67,43,2,58,90};
		int fmax = arr[0],smax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(fmax<arr[i])
			{
				smax=fmax;
				fmax=arr[i];
			}
			else if(smax<arr[i])
			{
				smax=arr[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}

}
