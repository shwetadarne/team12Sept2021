

import java.util.*;

  
class Deoctal
{
    
    static void decToOctal(int n)
    {
        
        int[] binaryNum = new int[1000];
   
        
        int i = 0;
        while (n > 0) 
        {
            
            binaryNum[i] = n % 8;
            n = n / 8;
            i++;
        }
   
        
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
      
    
    public static void main (String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr decimal number for octal conversion");
        int n =sc.nextInt();
        decToOctal(n);
    }
}
  