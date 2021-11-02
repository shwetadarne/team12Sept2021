import java.util.*;
class rectangle
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter width and height");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double z=x*y;
		System.out.println("area of rectangle ="+z);
		double w=2*(x+y);
		System.out.println("perimeter of rectangle ="+w);
	}
}

		
		