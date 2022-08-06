package Fristjavaprogram;

import java.util.Scanner;

public class FIBONACCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*int i,no,frist=0,second=1,next;
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter number of terms for series:");
		no=s.nextInt();
		frist=0;
		second=1;
		System.out.print("fabonacci series are:");
		for (i=0; i<no; i++){
			if (i<=1)
			next=i;
			else
			{
				next=frist +second;
				frist=second;
				second=next;
				
			}
			System.out.print(next+" ");*/
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter number of terms");
		/*int n=sc.nextInt();
		int frist=0,second=1,next;
		System.out.println("fabanocci series is");
		int i=0;
		while(i<n) {
			if (i<=1)
				next=i;
			else {
				next=frist+second;
				frist=second;
				second=next;
			}
			System.out.print(next+" ");
			i++;*/
		
		
			Scanner sk=new Scanner(System.in);
			System.out.println("enter any year");
		     int year=sk.nextInt();
		
		if (((year%400==0)&&(year%100==0)||(year% 4==0))){
		System.out.println("is a leap year");
		}
		else
			System.out.println("is a  not leap year");
	}
	
	
		
		
		/*int arraydemo[];
		arraydemo=new int [10];
		
		int arrayvalue[]= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};//10

		
		for ( int x = 0; x<=9; x++){
		
		System.out.print(arrayvalue[ x]+" ");*/
		
		/*int arrayvalues[]=new int[10];
		
		Scanner sk=new Scanner (System.in);
    for (int x=0; x<=9; x++) {
    System.out.println("enter the value at index"+ x);
    
    int abc=sk.nextInt();
	arrayvalues[x]=abc;
    }
	for(int y=0; y<=9;y++) {
	
	System.out.println(arrayvalues[y]);*/
	

		
		//BITWISE Operator (~(U),<<,>>,&&,|,^)
		
		/*byte a1=10,b1=2;
		
		// 0000 1010 
		// 0000 0010
		
		System.out.println(60<<2);
		
		System.out.println(60>>2);
		
		System.out.println(5&2);
		System.out.println(5|2);
		System.out.println(5^2);
		
	//Unary operator (++,--,!)
		int x=10;
		
		//int x1=11;
		//System.out.print(x +" ");
		//System.out.println(++x1);
		//System.out.print(++x);
	
			
			System.out.print(--x);*/
			
	//Decision making.....
		//if else statement 
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name =sc.next();
		System.out.println("enter the age");
			int age=sc.nextInt();
			
			if (age>=18) {
				System.out.println(" welcome "+ name + " you are eligible for vote ");
			}
				else
				System.out.println(" welcome "+ name + " you are  not eligible for vote ");	*/
		
		
		/*Scanner sk =new Scanner (System.in);
		System.out.println("enter the username");
		String username=sk.next();
		System.out.println("enter the password");
		String pass=sk.next();
		if (username.equals("ajay")&& pass.equals("123"))
		System.out.println(" welcome to office Mr. "+ username);
		else
			System.out.println(" login failed ,please enter valid username and password ");*/
		
		
	}
