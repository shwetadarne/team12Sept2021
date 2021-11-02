/*
class Recursion2
{
	static int show(int n)
	{
		if(n==4)
			return n;
		else
			return 2*show(n+1);
	}
	public static void main(String args[])
	{
		System.out.println(show(2));
	}
}*/

class Recursion2
{
	static int fact(int n)
	{
		if(n<=1)
			return 1;
		else
			return(n*fact(n-1));
	}
	public static void main(String args[])
	{
		System.out.println(fact(5));
	}
}