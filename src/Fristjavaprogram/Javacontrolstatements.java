package Fristjavaprogram;

public class Javacontrolstatements {

	public static void main(String[] args) {
		// conditional statement(selection statement)
		//loops /iterative statement
		//jump statement
		
		// conditional statement(selection statement)
		//1.if...else statement
		
		
		
		
		/*int age=10;
		if (age>=18)
		
		System.out.println ("eligible for vote");
		else 
		System.out.println (" not eligible for vote");
		
		
		
		/*int num=10;
		if (num%2==0)
		System.out.println ("number is even");
		
		else
		System.out.println ("number is odd");*/
		
		/*int a=50;
		int b=60;
		 if (a>b)
		 
		 System.out.println("a is largest");
		 else
		 System.out.println("b is largest");*/
		 
		 //Nasted  if statement
		 
		/*int day=8;
		
		if (day==1)
		{
			System.out.println("sunday");
		}
		else if (day==2)
		{
		   System.out.println("monday");
		}
		else if (day==3)
		{
			System.out.println("tusedsy");
		}
		else if(day==4)
		{
			System.out.println("wensday");		   
		}
		else if (day==5)
		{
	       System.out.println("thursday");
		}
	       else if (day==6)
		{
			System.out.println("friday");
		}
		else if (day==7)
		{
			System.out.println("saturday");
		}
		else if (day==8);
		System.out.println("nothing");*/

		
		
		//switch case
		
      int day=8;
      
      switch(day)
      {
      case 1:System.out.println("sunday");break;
      case 2:System.out.println("monday");break;
      case 3:System.out.println("tuesday");break;
      case 4:System.out.println("wendnesday");break;
      case 5:System.out.println("thursday");break;
      case 6:System.out.println("friday");break;
      case 7:System.out.println("saturday");break;
      default :System.out.println("invalid week number");break;
      
      }
      }
}

