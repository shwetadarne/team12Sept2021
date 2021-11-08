
import java.util.*;
public class Substring
{
	public static void main(String[] args) {
	   // int  arr[] = {5,4,3,2,1};
	    // int  arr[] = {7,6,5,4,3,2,1};
	     //int  arr[] = {1,2,3};
	       //int  arr[] = {2};
	    int count1=0;
	    int count2=0;
	
	for(int i=0;i<arr.length-1;i++)
	{
	  
	    if(arr[i]<arr[i+1])
	    {
	       
	        count1++;
	    }
	    else if(arr[i]>arr[i+1])
	    {
	        count2++;
	    }
	}
	
    if(count2==arr.length-1)
    {
       
        System.out.println(count2);
    }
    else if(count1==arr.length-1)
    {
        int y=0;
        System.out.println(y);
    }
    
    else
    System.out.println(arr.length-count1);
	
	}
}












