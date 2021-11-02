import java.util.*;
class series
{
	  public static int show(int n)
	{
		int a=n;
		if(n==1)
			return 1;
		//else
		//int a=n;
	//System.out.println(n+" ")
	          //a=n;
			  else
		 return (show(--n));
		 
		System.out.println(a+" ");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	  System.out.println("enter any number");
	  int num=sc.nextInt();
	  show(num);
	}
}