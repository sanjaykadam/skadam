package javaPracticequestion;

import java.util.Scanner;

public class REVERSEANUMBER {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		
		//1.using algoritham........
		
		/*int rev=0;
		
		while(num !=0) 
		{
    rev= rev*10 +num%10;
     num= num/10;
 
	}
  System.out.println("Reverse numer is " +rev);*/
		
		
		
		///USING STRINGBUFFER CLASS
		
		/*StringBuffer  sk=new StringBuffer (String.valueOf(num));
		
		StringBuffer rev=sk.reverse();
		System.out.println("Reverse the num "+rev);*/
		
		
		//USING STRINGBUILDER CLASS
		
		StringBuilder sk=new StringBuilder();
		
		sk.append(num );
		
		StringBuilder rev=sk.reverse();
		System.out.println("Reverse the num "+rev);
		
}
}