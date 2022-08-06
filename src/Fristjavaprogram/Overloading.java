package Fristjavaprogram;

import java.util.Scanner;

public class Overloading {

	public static void main(String[] args) {
   /* Overloading obj=new Overloading();
    obj.demo();
    obj.demo( 15);
    obj.demo("sanjay");
    obj.demo(10, 20);

	}

	public void demo() {
		System.out.println(" i am in method demo");
	}
	public void demo(int a) {
		System.out.println(" i am in method demo WITH SINGLE ARG AS INT DADATYPES");
		System.out.println(a);
}
	public void demo(String abc) {
		System.out.println(" i am in method demo eith single arg as string datatypes");
		System.out.println(abc);
	}
	
	public void demo( int a, int b) {
		System.out.println(" i am in method demo with double arg as int datatypes");
		System.out.println(a+" "+b);*/
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter frist number");
	int a=sc.nextInt();
	System.out.println("enter second number");
	int b=sc.nextInt();	
	Overloading obj=new Overloading ();
		obj.cal(a);
		obj.cal( a,b);
		
		
	}
	
	public void cal(int abc) {
		int result=1;
		for(int count=1; count<=abc; count++) {
			result=result*count;
		}
		System.out.println(" factorial "+result);
	}
	
	public void cal(int x ,int y) {
		int result=x+y;
		System.out.println(result);
	}
}