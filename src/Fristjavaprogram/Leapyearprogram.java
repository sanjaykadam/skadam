package Fristjavaprogram;

import java.util.Scanner;

public class Leapyearprogram {

	public static void main(String[] args) {
		/* int my_input = 1996;
		      boolean isLeap = false;
		      System.out.println("The year is defined as " +my_input);
		      if (my_input % 4 == 0) {
		         if (my_input % 100 == 0) {
		            if (my_input % 400 == 0)
		               isLeap = true;
		            else
		               isLeap = false;
		         }
		         else
		           isLeap = true;
		      }
		      else
		      isLeap = false;
		      if (isLeap)
		         System.out.println(my_input + " is a Leap year");
		      else
		         System.out.println(my_input + " is not a Leap year");*/
	
	
	Scanner san=new Scanner(System.in);
	//System.out.println("enter any number");
	
	int year=2028;
	
	if (year % 400==0 || (year%4==0 && year%100!=0))
	{
		System.out.println("year is leap year");
	}
	else
	{
		System.out.println("year is not leap year");
	}

	}
}