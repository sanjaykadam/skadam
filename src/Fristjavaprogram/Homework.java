package Fristjavaprogram;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
	
		
		/*Scanner sk=new Scanner (System.in);
		System.out.println("enter any number");
		int s =sk.nextInt();
		int i=0,j=1, next;
		System.out.println("fibonacci series is ");
		
    for (int c=0; c<s; c++) {
    	
    if (c<=1)
    	next=c;
    else {
    	   next =i+j;
    	   i=j;
    	   j=next;*/
		
		/*Scanner sk=new Scanner (System.in);
		System.out.println("enter prime number");
		int no=sk.nextInt();
		int count=0;
		for (int x=2 ; x<=no-1 ; x++) {
			
			if (no % x==0) {
				count=count+1;
				break;
			}
		}
		if (count==0) {
			System.out.println(no+" is a prime number");
		}
		else {
			System.out.println(no+" is non prime number");
			
		}		
		
		
    }
    
	}

  
		
		/*double n1=-4.5, n2=3.9, n3=2.5;
		
		if (n1>=n2 && n1>=n3)
		System.out.println(n1+" it is largest number");
		
		else if(n2>=n1 && n2>=n3)
		System.out.println(n2+" it is largest number");
		
		else
			System.out.println(n3+" it is largest number");*/
		
		
		/*int year=1922;
		
		if((year%400==0)&&(year%100==0)||(year%4==0))
		System.out.println("it is a leap year");
		else 
			System.out.println("it is not  a leap year");*/
		
		/*Scanner sk=new Scanner (System.in);
		System.out.println("enter the frist number");
		int num1=sk.nextInt();
		System.out.println("enter the second number");
		int num2=sk.nextInt();
		System.out.println("enter the third number");
		int num3=sk.nextInt();
		
		if (num1>=num2 && num1>=num3){
		System.out.println(num1+" it is a largest number ");
		}
		else if (num2>=num1 && num2>=num3){
		System.out.println(num2+" it is a largest number ");
		}
		else {
	    System.out.println(num3+" it is a largest number ");*/

		Scanner sk=new Scanner (System.in);
		System.out.println("enter the principle amount");
		int p=sk.nextInt();
		System.out.println("enter the rate of intrest for annum");
		int r=sk.nextInt();
		System.out.println("enter number of mouths");
		int n=sk.nextInt();
		int EMI;
		int pandi;
		pandi=(p*r*(1*r)*n)/((1+r)*n-1);
		EMI=pandi/n;
		System.out.println(EMI);
		
	}
}
