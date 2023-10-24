package testYantraClass;

import java.util.Scanner;

public class LastMin {
//last min means highest
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("initial value of array :");
		int[] ar=new int[sc.nextInt()];
		System.out.println("initialize the values :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("print max or last min");
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
				max=ar[i];
		}
		System.out.println(max);

	}

}
