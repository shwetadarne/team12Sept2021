import java.util.*;
class mergeArray
{
	 public static void merge(int arr1[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("size for 2nd array");
		int z=sc.nextInt();
		int arr2[]=new int[z];
		int arr3[]=new int[arr1.length+arr2.length];
		int count=0;
		System.out.println("enter element for 1st array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		    //count++;
		}
		System.out.println("enter element for 2nd array");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		for(int k=0;k<arr1.length;k++)
		{
			arr3[k]=arr1[k];
			count++;
			
		}
		
		for(int k=0;k<arr2.length;k++)
		{
		  arr3[count++]=arr2[k];
			
		}
		System.out.println("merge array ");
		for(int k=0;k<arr3.length;k++)
		{
		  System.out.println(arr3[k]+" ");
		
		
		}
	}
		
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("size for 1st array");
		int x=sc.nextInt();
		int arr[]=new int[x];
		
		merge(arr);
	}
}
