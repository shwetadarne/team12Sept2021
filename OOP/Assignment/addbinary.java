import java.util.*;
public class addbinary{
   public static void main(String args[])
   {
	    Scanner sc = new Scanner(System.in);

	long b1, b2;
	int i = 0, carry = 0;

	int[] sum = new int[10];
	
	System.out.print("Enter 1  binary number: ");  
	                                              
												   
	b1 = sc.nextLong();
	System.out.print("Enter second binary number: ");
	b2 = sc.nextLong();

	while (b1 != 0 || b2 != 0) 
	{
		sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
		carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
		b1 = b1 / 10;
		b2 = b2 / 10;
	}
	if (carry != 0) {
		//sum[i++] = carry;
	sum[i] = carry;
	}
	//--i;
	System.out.print("Output: ");
	while (i >= 0) {
		System.out.print(sum[i--]);
	}
	System.out.print("\n");  
   }
}