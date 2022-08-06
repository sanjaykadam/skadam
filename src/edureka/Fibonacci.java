package edureka;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

///leap year program:-
		/*Scanner sk=new Scanner(System.in);
	
		int year=2020;
		
		if (year %400==0)
		System.out.println("is aleap year");
		else if (year % 100==0)
			System.out.println("is a not leap year");
		else if (year % 4==0)
			System.out.println("is a  leap year");
		else
			System.out.println("is a not leap year");*/
		
		
		/*int year=1999;
		if((year %400==0)||((year % 4==0)&&(year %4==0))){
			System.out.println("is a  leap year");
		}
			else {
				System.out.println("is a not leap year");*/
		
		
		int year;
		System.out.println("enter any year:");
		Scanner sk =new Scanner (System.in);
		year =sk.nextInt();
		
		if (((year %400==0)&&(year%100==0))||(year%4==0))
		System.out.println("is a  leap year");
		
			else 
				System.out.println("is a not leap year");
		
		//fibonacci series program
		
		
		/*int n, a=1, b=0,c=1;
		Scanner sk =new Scanner (System.in);
		System.out.println("enter  value of n:");
		n =sk.nextInt();
		System.out.println("fabonacci series:");
		for(int i=0; i<=n ;i++);
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+"  ");
			*/
		}
	}
	


