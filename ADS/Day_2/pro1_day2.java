import java.util.*;
class pro1_day2
{     //Insertion
	public static void insertion(int arr1[])
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("enter any elements in array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
	}
	//Deletion
	public static void delete(int arr1[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element to delete");
		int x=sc.nextInt();
		int i;
		for( i=0;i<arr1.length;i++)
		{
			if(arr1[i]==x)
				break;
		}
		for(int j=i;j<arr1.length-1;j++)
		{
			arr1[j]=arr1[j+1];
		}
		System.out.println("after deletion of element");
		for(int k=0;k<arr1.length-1;k++)
		{
			System.out.println(arr1[k]);
		}
	}
	    //Searching
	public static void search(int arr1[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter search key");
		int z=sc.nextInt();
		int i;
		for(i=0;i<arr1.length;i++)
		{
			if(z==arr1[i])
				break;
		}
		if(i==arr1.length)
			System.out.println("item is not search at"+i);
		else
			System.out.println("item is search");
	}
	public static void main(String args[])
	{
		int arr[]=new int[5];
		insertion(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+" "+arr[i]);
		}
		delete(arr);
		search(arr);
	}
}
		
		