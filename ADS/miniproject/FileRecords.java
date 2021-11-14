import java.util.*;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 
 import java.text.SimpleDateFormat;
import java.util.Date;
public class FileRecords
{
	 public static String[] read (File f1,Scanner sc1)
			 {
				 String ar[];
				while(sc1.hasNextLine())
				{
					String op =  sc1.nextLine();
					
					String ar[]=op.split("\n");
					
				 
				// for(String str1:op)
				 //{
				//	 System.out.println(str1);
				// }
					/* for(int i=0;i<ar.length-1;i++)
					{
					 for(int j=1;j<ar.length;j++)
					 {
						 if(ar[i]==ar[j])
						 {
							 count++;
						 }
					 }
					}*/
					//for(String str1:ar)
					//{
					//System.out.println(str1);
				   // System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				 
					//System.out.println(count);
					//}
				
			 
			//for(String str:ar)
			//{
				//System.out.println(str);
			//}
			 //static int count=0;
				/* for(int i=0;i<ar.length-1;i++)
				 {
					 for(int j=1;j<ar.length;j++)
					 {
						 if(ar[i]==ar[j])
						 {
							 count++;
						 }
					 }
				 }*/
				// System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				 
				// System.out.println(count);
				// while(
				 
				 
				//if (op.contains(name)) {
                 //a match!
               // System.out.println("I found " + name);
               // break;
            //}
			//else
				//System.out.println("I found " + name);
				//System.out.println(op);
			
			//sc1.close();
				}
				return ar;
			 }
	public static void main(String args[])	
	{
		
    int count=0;
	//String ar[];
  /*
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
   LocalDateTime now = LocalDateTime.now();
   System.out.println(dtf.format(now));
   System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
   


   
      Date date = new Date();
      String strDateFormat = "HHmm";
      SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
      System.out.println(sdf.format(date));
   */

		try
		{
			
         Scanner sc=new Scanner(System.in);
			File f1= new File("DonorsRecord.csv");
			f1.createNewFile();
              //String ar[];
			  //String b[];
			FileWriter fw = new FileWriter("DonorsRecord.csv",true);
			
			 System.out.println("enter your name address and phone no.");
			              fw.write("\r\n");                   //append the data
			  String name1=sc.nextLine();
			  fw.write(name1);
			  fw.write("  ");
			 String address=sc.nextLine();
			  fw.write(address);
			  fw.write("  ");
			  long ph=sc.nextLong();
			  String str=String.valueOf(ph);
			 // fw.sc.nextLine();
			 fw.write(str);
			 

			fw.close();
			
			 Scanner  sc1=new Scanner(f1);
			 String ar1[]= FileRecords.read(f1,sc1);
				
			 for(String str1:ar1)
					{
					System.out.println(str1);
					}
		}
		catch(Exception e)
		{
			System.out.println("IOException caught");
			e.printStackTrace();
		}
	}
}
	
