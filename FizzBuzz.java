import java.io.*;
import java.util.*;

public class FizzBuzz {
	
	public static void main( String args[]) throws IOException
	{   
		 // Declare the object and initialize with predefined standard input object		
		Scanner sc = new Scanner(System.in);
		
		// Input  how many no you want to enter
		System.out.println( " How many number you want to enter");
		int noYouWantToEnter =sc.nextInt();
		
		// Creating an ArrayList of String
        List<Integer> number = new ArrayList<>();
		 // Input array number
		for(int i=0;i< noYouWantToEnter ;i++)
		{
			 System.out.println("Please enter the number for" + i+1 + "th location");	
			 int arrno = sc.nextInt();
			 number.add(arrno);
	   }		
		 // Itearting number and printing Fizz, Buzz and FizzBuzz
     
		for( Integer input : number)
		{
			for ( int i=1; i <= input ;i++)
			{ 
			 if( i%15 ==0)
				{
					System.out.println ("FizzBuzz");
				}
			   else if( i%3==0)
				{
					System.out.println("Fizz");
					
				}
				
				else if(i%5==0)
				{
					System.out.println("Buzz");
				}
				
				else
					System.out.println(i);
				
			}
		}
		
		
	}	

}
