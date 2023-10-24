package TYSSInterview;

import java.util.Scanner;

public class TransPoseOfMatrix {
public static int[][] initArr(int[][] arr,int col,Scanner sc)
{
	System.out.println("initialize the array ");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<col;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	return arr;
	
}
	public static void main(String[] args) {
		System.out.println("enter the row and column of an array ");
		Scanner sc=new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println(arr.length);
		initArr(arr, col, sc);
	}

}
