package Fristjavaprogram;

import java.util.Scanner;

public class calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*int a=10;
		int b=3;
		int result;
		
		result=a+b;
		
		System.out.println("addition "+result);
		
		result=a-b;
		System.out.println("sub "+result);
		
		result=a*b;
		System.out.println("mul "+result);
		
		result=a/b;
		System.out.println("divide "+result);
		
		result=a%b;
		System.out.println("module "+result);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter frist value");
		int a=sc.nextInt();
		
		/*if(a%2==0)
		
		System.out.println("it is even no");
		
		else 
			System.out.println("its an odd no");*/
		int b=sc.nextInt();
		System.out.println("enter second value");
		
		int result=a+b;
		
		if(result %2==0) {
			System.out.println(a*b);
			System.out.println(" it is an even no :" +result);
		}
		else {
			System.out.println(a-b);
			System.out.println(" it is an odd no :" +result);
		}
	}
}