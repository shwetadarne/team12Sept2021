import java.util.*;
class Substring_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2;
		int a;
		String str1[]=str.split(" ");
		if(str1.length==1)
		{
			System.out.println(0);
		}
		else
		{
		   a=str1.length-1;
			str2=str1[a];
		   System.out.println(str2.length());
		}
	}
}