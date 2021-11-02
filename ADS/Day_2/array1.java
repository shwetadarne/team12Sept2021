class array1
{
	public static void main(String args[])
	{
		int[] a1;
		a1=new int[100];
		int n=0;
		n=10;
		a1[0]=11;
		a1[1]=12;
		a1[2]=13;
		a1[3]=14;
		a1[4]=15;
		a1[5]=16;
		a1[6]=17;
		//display
		for(int i=0;i<n;i++)
		{
			System.out.println(a1[i]);
		}
		//search
		int key=13;
		for(int i=0;i<n;i++)
		{
			if(key==a1[i])
				break;
		}
		if(i==n)
			System.out.println("not found");
		else
			System.out.println("found");
		//Delete
		int key=99;
		for(int i=0;i<n;i++)
		{
			if(a1[i]==key)
				break;
		}
		for(int k=i;k<n;k++)
		{
			a1[k]=a1[k+1];
		}
		n--;
			
	}
}

			
		