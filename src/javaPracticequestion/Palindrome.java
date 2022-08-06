package javaPracticequestion;

import java.util.Scanner;

public class Palindrome {
	
public static void main(String[] args) {
/*	int num=454;

	
	int rev=0,temp;
	temp=num;
	while (num>0) 
	{
		 int d=num%10;
		 rev=(rev*10)+d;
		 num=num/10;
		 
	}
	if(temp==rev)
	{
		System.out.println(" is  pelindrome");
	}
	else 
	{
		System.out.println(" is not pelindrome");
	}
}*/
	
	/*int  r,sum=0,temp;
	int n=454;
	
	temp=n;
	
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
		System.out.println("palindrome number");
	else
		System.out.println(" not palindrome");*/
	
	String ori,rev=" ";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number/String ");
   ori=sc.nextLine();	
   int length=ori.length();
   for(int i=length-1;i>=0;i--)
   
	   rev=rev+ori.charAt(i);
   
	if(ori.equals(rev))
	
		System.out.println("enter string/numer is palindrome");
	
	else
	
		System.out.println("enter string/numer is not palindrome");	
	
	
}
}