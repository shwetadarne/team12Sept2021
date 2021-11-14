

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
class visitor

{
	static Node head;
   static class Node
  {
	  String name;
	  String address;
	  
	  Node link;
	  Node(String str,String str1)
	  {
		  name=str;
		  address=str1;
		 
		  link=null;
	  }
  }
	Scanner sc=new Scanner(System.in);
	
	visitor()
	{
	}
	
	 void entry()
	{
		System.out.println(            "====*====*====*====*====*=====*====*====*====*=====*");
		System.out.println(            "|    Welcome to Ayodhya Shelter Home!!!!!!!!!!     |");
		System.out.println(            "====*====*====*====*=====*=====*====*====*====*====*");
	}
	void generalDetails()
	{
		System.out.println("\n\nenter your Name and address for security purpose");
		System.out.println(" ");
		String name=sc.nextLine();
		
		String address=sc.nextLine();
		insertEnd(name,address);
		
		display();
	}
	
	 void insertEnd(String name,String address)
   {
	  Node new_node=new Node(name,address);
	    new_node.link=null;
		Node n=head;
		if(head==null)
		{
			head=new Node(name,address);
		}
		else
		{
		while(n.link!=null)
		{
			n=n.link;
		}
		n.link=new_node;
		}
   }
    public void display()
  {
	  Node n=head;
	  while(n!=null)
	  {
		
		  System.out.println("your details are :"+"\n"+"Name is :"+n.name+"\n"+"Address is :"+n.address);
		  System.out.println();
		  n=n.link;
	  }
  }
	void choice()
	{
		int q;
		
	do
		{
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("| enter 1 for Food Distribution ||   2 for Other Dispensiries ||   3 for Donation(money)|  ");
		System.out.println("--------------------------------------------------------------------------------------");
		int ch=sc.nextInt();
		boolean b;
		
		switch(ch)
		{
			
			default:
			System.out.println("You can spend some time with them ********\n*********because Time is one of the most powerful things in this entire universe");
			break;
			case 1:
			    foodDistribute();
			 break;
            case 2:
			otherDispeceries();
			 break;
            case 3:
			  donation();
			break;
		}
		System.out.println("  continue the process press (1) or press (0) for exit ");
		 q=sc.nextInt();
           
		 
		}while(q!=0);
        	
	}
	void foodDistribute()
	{
		String food[]=new String[3];
		food[0]="Fruit and vegetables";
		food[1]="Milk and dairy products";
		food[2]="Beans, pulses";
		 System.out.println("you can come with these nutritious food also ======>");
		 System.out.println(" ");
		 System.out.println(" ----*-----*------*-----*-------*-----*------*------*------*---------*----");
		 for(int i=0;i<3;i++)
		 {
			 System.out.print("[ "+food[i]+" ]   ");
		 }
		 System.out.println(" ");
		 System.out.println(" ----*-----*------*-----*-------*-----*------*------*------*----------*----");
			  
			  System.out.println(" ");
				  System.out.println("You can distribute the food in between 12 pm and 2 pm");
				   System.out.println(" ");
				  System.out.println("thank you for your Delicious and Nutritious food to our childreans ");
				 
			  
		
			
	}
	void otherDispeceries()
	{
		String dis[]=new String[4];
		 dis[0]="Old clothes";
		 dis[1]="school uniform";
		 dis[2]="toys";
		 dis[3]="notebooks and pens";
		 System.out.println("you can come with these items also ======>");
		 System.out.println(" ");
		 System.out.println(" ----*-----*------*-----*-------*-----*------*------*------*---------*----");
		 for(int i=0;i<4;i++)
		 {
			
			 System.out.print("[ "+dis[i]+" ]   ");

		 }
		 System.out.println(" ");
		 System.out.println(" ----*-----*------*-----*-------*-----*------*------*------*----------*----");
			   
			  System.out.println("You can distribute items in between 2.30 pm and 4.30 pm");
			  System.out.println(" ");
				  System.out.println("thank you for your lovely gifts");
			  
			  
				  
		      
			  
	}
	void donation()
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter your amount");
		 long amount=sc.nextLong();
		 if(amount<0)
		 {
			 System.out.println("please enter valid amount!!!!");
		 }
		  else if(amount<25000)
		 {
			 System.out.println("you donate a good amount to our orphanage home ");
			 System.out.println("|```````|");
			 System.out.println("| *   * |");
			 System.out.println("|   |   |     THANK YOU!!!!!");
			 System.out.println("|   _   |");
			 System.out.println("| _ _ _ |");
		 }
		 else
		 {   
			 System.out.println("How many visits you have given to our orphanage home!!!!!");
			 int z=sc.nextInt();
			 if(z<=3)
			 {
			
				 System.out.println("we will be happy to see you again!!!");
			 }
			 else
			 {
				 System.out.println("********* CONGRATUlATIONS*************");
				 System.out.println(" ");
				 System.out.println("=====>  we want you to address our childrens in next program!!!!!!!");
				 System.out.println(" ");
				 
		   System.out.println("you gave us a very good amount it will help our childrens a lot \n \t we sincerealy hope that you will stay involved ");
		   
		 }
		 }
			 
		 
	}
	
}

class Orphanage

{
	public static void main(String rags[])
	{
		visitor v1=new visitor();
		visitor l1=new visitor();
		
		Scanner sc=new Scanner(System.in);
		
			System.out.println("  ***** VISITING TIME (10AM to 5PM)*****");
			System.out.println("are you arrived in time between 10AM to 5PM-----yes/no");
			String str1=sc.next();
		
			if(str1.equals("yes"))
			{
				System.out.println("\t[you can enter now :)- ]");
				v1.entry();
				v1.generalDetails();
				
				v1.choice();
				System.out.println("THANK YOU  FOR VISITING:)-   !!!");
			}
		   
		
			else{
			System.out.println("  [ SORRY VISITING TIME IS OVER!!! ]  ");
			}
	}
}
	

