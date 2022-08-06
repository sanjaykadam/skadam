package Fristjavaprogram;

import java.util.Scanner;

public class Conditionstatement {

	private static Scanner Scanner;

	public static void main(String[] args) {

	/*Scanner sc=new Scanner(System.in);
	System.out.println("enter frist value:");
	int a=sc.nextInt();
	
	System.out.println("enter second value:");
	int b=sc.nextInt();
	
	int result =a+b;
	System.out.println("result="+result);
	if (result>100);
	System.out.println("result is greater than 100");*/
		
		
		//int abc=1;
		
		//scanner class
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your age");
		int age= obj.nextInt();
		
		if(age<18) {
			System.out.println("you got 10% discount")	;
		}
		else if(age>18 && age<45) {
		System.out.println("no discount");
		}
		else if(age>45 && age<60) {
			
		System.out.println("you got 20% discount");
			}
		else if (age>60) {
		System.out.println("you will get 40% discount");
			}
		else {
			System.out.println("this are boundry value ,please do not enter the age 18,45,60");
			
		}
		
			}
}