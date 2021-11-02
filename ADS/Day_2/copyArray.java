import java.util.*;
class copyArray
{
	//Scanner sc=new Scanner(System.in);
	public static void copy()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size for 1st array");
		int x=sc.nextInt();
		int arr[]=new int[x];
		System.out.println("enter size for 2nd array");
		int z=sc.nextInt();
		int arr1[]=new int[z];
		System.out.println("enter element in 1st array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter element in 2nd array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=arr1[i];
		}
		System.out.println("after copy array is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
	}
		
	
	public static void main(String args[])
	{
		copy();
	}
}