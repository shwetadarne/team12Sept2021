class towerOfHawai
{
  static  void toh(int n,char s,char inter, char d)
  {
	  if(n==1)
	  {
		  System.out.println("Disk 1 from "+s+" to "+d);
	  }
	    else
		{
			toh(n-1,s,d,inter);
		System.out.println("Disk "+n+" from "+s+" to "+d);
		toh(n-1,inter,s,d);
		}
  }
	public static void main(String str[])
	{
		int n=3;
		toh(n,'A','B','C');
	}
}