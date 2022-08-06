package Fristjavaprogram;

import java.util.Scanner;

public class Homework_assigement {

	public static void main(String[] args) {
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter any value");
		int abc =sc.nextInt(); 
	
	if(abc > 20) {
			System.out.println("abc is grester than 20");	
			System.out.println(" we are in if condition ");
		}
		
	
		System.out.println("conditional statement");
		System.out.println("abc = "+abc);*/
		
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("enter frist value");
		int a=sc.nextInt();
		System.out.println("enter second value");
		int b=sc.nextInt();
		
		int result;
		result=a+b;
		
		if( result > 100) {
			System.out.println("Result = "+result);
			System.out.println("Result is grester than 100");	
		}
		else
		System.out.println("Result is not  grester than 100");*/	
	
		/*Scanner sk =new Scanner (System.in);
		System.out.println("enter your age");
		int age=sk.nextInt();
		
		if (age < 18) {
			System.out.println("you got 10% discont");
		}
			else if(age > 18 && age > 45) {
				System.out.println("you got no discont");		
			}
			else if (age > 45 && age < 60) {
				System.out.println("you got 20% discont");	
			}
			else if (age > 60){
				System.out.println("you got 40% discont");	
			}
			else {
			
			System.out.println("This are the boundry values,PLEASE DO NOT ENTER THE AGE 18,45,60");*/
		
		/*Scanner sc=new Scanner (System.in);
		System.out.println("enter frist value");
		int x =sc.nextInt();
		System.out.println("enter second value");
		int y =sc.nextInt();
		
		int result =x+y;
		
		if(result%2==0) {
			System.out.println(result+" is an even number");
			System.out.println(x*y);
		}
			else {
				System.out.println(result+" is an odd number");
				System.out.println(x-y);*/
				
				
		//	Scanner sc =new Scanner(System.in);
			/*int userinput;
			int evenno=0;
			int oddno=0;
	
			
			for(int abc =1 ; abc <=10 ; abc++) {
				System.out.println("enter "+abc +"values");
				userinput=sc.nextInt();
				System.out.println(userinput);
				
				if(userinput%2==0) {
					evenno=userinput+oddno;
				}
				else {
					oddno=userinput+evenno;
				}
			}
			System.out.println(" even no total = " + evenno);
			System.out.println(" odd no total = " + oddno);*/
		
		
		
		
		
		
		
		
		
		
		Scanner sc =new Scanner(System.in);
		String name;
		int age=0;
		String palce;
		for (int a=1 ; a<=3 ;a++) {
		System.out.println("enter your name");
		 name=sc.next();
		System.out.println("enter your age");
		 age =sc.nextInt();
		System.out.println("enter your place");
		 String place = sc.next();
		 
		 System.out.println(name+" "+age+" "+place);
		}
	}
}