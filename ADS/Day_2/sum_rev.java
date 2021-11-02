import java.util.*;
class sum_rev
{
	         //Addition
	public static void sum(int arr1[])
	{
		Scanner sc=new Scanner(System.in);
		 int sum1=0;
		 System.out.println("enter elements in array");
		 for(int i=0;i<arr1.length;i++)
		 {
			 arr1[i]=sc.nextInt();
			 sum1=sum1+arr1[i];
		 }
		 System.out.println("sum of array"+sum1);
	}
		      //Reverse
	public static void reverse(int arr1[])
	{
		int as[]=new int[arr1.length];
		int k=0;
		for(int i=arr1.length-1;i>=0;i--)
		{
			
				
				as[k]=arr1[i];
				k++;
			
		}
		System.out.println("reverse array is");
		for(int j=0;j<as.length;j++)
			{
				System.out.println(as[j]);
			}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter size");
	    int x=sc.nextInt();
		int arr[]=new int[x];
		sum(arr);
		reverse(arr);
	}
}

		