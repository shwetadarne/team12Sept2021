
import java.util.*;
class Array2d
{
	public static void additon()
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("enter row size");
		int row=sc.nextInt();
		System.out.println("enter column size");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("enter element for 1st  array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter row size");
		 row=sc.nextInt();
		System.out.println("enter column size");
		 col=sc.nextInt();
		int arr1[][]=new int[row][col];
		System.out.println("enter element for 1st  array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		int arr2[][]=new int[row][col];
		System.out.println("additon of array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr2[i][j]=arr[i][j]+arr[i][j];
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println(" ");
		}
    }
	public static void main(String args[])
	{
		additon();
	}
}





















