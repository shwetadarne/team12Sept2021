import java.util.*;
class circle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius for circle");
		double r =sc.nextFloat();
		 double area =Math.PI*r*r;
		double peri =2*Math.PI*r;
		System.out.println("area of circle is: "+area);
		
		System.out.println("perimeter of circle is: "+peri);
	}
}

	

        