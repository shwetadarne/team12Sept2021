import java.util.*;
class swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("ener 2 numbers for swapping");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("1 number is:"+x);
		System.out.println("2 number is:"+y);
		
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("after swapping:");
		System.out.println("1 number is:"+x);
		System.out.println("2 number is:"+y);
	}
}
		