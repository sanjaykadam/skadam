package javaPracticequestion;

import java.util.Scanner;

public class Swapingtwonumber {

	
	public static void main(String[]args) {
		//---------- logic is= adding variable 
		int a=10, b=20;
//		System.out.println("before swip two number "+ a  + " " + b);
//		int c=a;
//		 a=b;
//		 b=c;
//		
//		
//		System.out.println("after swip two number "+a +" " +b);
		
		////----------logic uses ++ & --;
		/*System.out.println("after swip two number "+a +" " +b);
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println("after swip two number "+a +" " +b);*/
		
		
		//-----------logic= * and / without using variable
		// a & b shoud not be zero.
		
		/*System.out.println("after swip two number "+a +" " +b);
		
		a=a*b;//10*20=200
		b=a/b;//200/20=10
		a=a/b;//200/10=20
		
		
		System.out.println("after swip two number "+a +" " +b);*/
		
		///-----logic bitwise   
		
		System.out.println("before swip two number "+a +" "+b);
		a=a^b; //10^20=30
		b=a^b; //30^20=10
		a=a^b; //30^10=20
		
		System.out.println("after swip two number "+a +" "+b);
		
		////-----logic =single statement
		//System.out.println("before swip two number "+a +" "+b);
		//b=a+b-(a=b);
		
		//System.out.println("after swip two number "+a +" "+b);
		
//	int 	c=a+b;
//	    b=a;
//	    a=b;
//	    System.out.println("swap two number");
		
//	
		//int a=25,b=50;
//		System.out.println(" before swaping two number  " + a +"  "+ b);
//		int c=a;
//		 a=b;
//		 b=c;
//		 System.out.println("aftre swaping two number"+a+" "+b);
//	System.out.println("before swaping two number"+a+" "+b);
//		a=a+b;//75
//		b=a-b;//75-50=25
//		a=a-b;//75-25=50
//		
//		System.out.println("after swaping two number "+a+" "+b);
//		
//		Scanner sk= new Scanner(System.in);
//		System.out.println("enter any  two number");
//		
//		 a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("swaping two numbers");
	}
}
