package Fristjavaprogram;

import java.util.Scanner;

public class CALCULATOR {

	public static void main(String[] args) {
	
		
		/*int num1, num2 , num3,num4  ,sum;
		Scanner sc =new Scanner (System.in);
		System.out.println("enter frist number");
		num1 =sc.nextInt();
		
		System.out.println("enter second number");
		num2 =sc.nextInt();
		
	
		System.out.println("enter third number");
		num3 =sc.nextInt();
		
		
		System.out.println("enter third number");
		num4 =sc.nextInt();
		
		sc.close();
		sum =(num1 +num2 + num3 +num4 );
		System.out.println("sum of three numbers: "+sum);*/
		
		
		
		
		/*int num;
		System.out.println("enter an interger value");
		Scanner san =new Scanner(System.in);
		
		num=san.nextInt();
		
		if (num % 2 == 0)
		System.out.println("entered number is even");
		else 
		System.out.println("entered number is odd ");*/
		
		/*Scanner san =new Scanner(System.in);
		System.out.println("enter frist number");
		
		int num1=san.nextInt();	
		
		
        System.out.println("enter second number");
		
		int num2=san.nextInt();	
		
		int result=num1*num2;
		
		System.out.println("output:"+result);*/
	
		/*Scanner k =new Scanner(System.in);
		System.out.println("enter any number:");
		
		 int num =k.nextInt();
		 
		 if(num %2==0)
		 System.out.println("even num:"+num);
		 
		 else
			 System.out.println("odd num:"+num);*/
		 
//leap year 
		
		/*Scanner sk=new Scanner(System.in);
		int year=1996;
		System.out.println("enter any year:");
		
		year =sk.nextInt();
		
		if (((year %4 ==0)&&(year%100!=0))||(year %400==0))
		System.out.println("it is leap year");
		else 
			System.out.println("it is not leap year");*/	
		
		
		
		
		//java program for largest number among three.
		
		/*int n1,n2,n3, largest;
		
		Scanner sk= new Scanner(System.in);
		System.out.println("enter three number:");
		
		n1=sk.nextInt();
		n2=sk.nextInt();
		n3=sk.nextInt();
		
		if (n1>=n2 && n1>=n3) {
			System.out.println("largest number:"+n1);
		}
		else	if (n2>=n1  && n2>=n3) {
			System.out.println("largest number "+n2);
		}
		//else (n3>=n1 && n3>=n2) {
			System.out.println("largest number "+n3);*/
		
		
		//SWAP TWO NUMBER 
		
		
		
		 /*int a,b,c;
		 Scanner sk=new Scanner(System.in);
		 System.out.println("enter value in a:");
		 a=sk.nextInt();
		 System.out.println("enter value in b:");
		 b=sk.nextInt();
		 c=a;
		 a=b;
		 b=c;
		 System.out.println(" value in a:"+a); 
		 System.out.println(" value in a:"+b);*/ 
		 
		 
		 /*int a,b;
		 Scanner sk=new Scanner(System.in);
		 System.out.println("enter value in a:");
		 a=sk.nextInt();
		 System.out.println("enter value in b:");
		 b=sk.nextInt();
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println(" value in a:"+a); 
		 System.out.println(" value in a:"+b); */
		 
		
		/*int i,no,a=1,b=0, next;
		Scanner  sk=new Scanner(System.in);
		System.out.println("enter number in term for series:");
		 no=sk.nextInt();
		 a=1;
		 b=0;
		 System.out.println("fibonacci series are: ");
		 for (i=0; i<no; i++);{
			 System.out.println(a);
			 next =a+b;
			 a=b;
			 b=next;*/
		
		
		 /*int a,no,b,temp=0;
		 Scanner  sk=new Scanner(System.in);
		 System.out.println("enter any number:");
		 no=sk.nextInt();
		 b=no;
		 while (no>0) {
			 a=no%10;
			 no=no/10;
			 temp=temp*10+a;
		 }
		 if (temp==b) {
			 System.out.println("palindrom");
		 }
		 els1e {
			 System.out.println(" not palindrom");*/
			 
		//int n1=0,n2=0,n3=0, largest;
		Scanner ssk=new Scanner(System.in);	 
			// System.out.println("enter FRIST number:");
			 int n1=ssk.nextInt();
			// System.out.println("enter second number:");
			 int n2=ssk.nextInt();
			// System.out.println("enter thrid number:");
			 int n3=ssk.nextInt();
			 
			 
			////largest= ssk.nextInt() ;
			
			if (n1>=n2 && n1>=n3) {
				System.out.println("largest number:"+n1);
			}
			else	if (n2>=n1  && n2>=n3) {
				System.out.println("largest number "+n2);
			}
			else (n3>=n1 && n3>=n2) {
				System.out.println("largest number "+n3);
				}
	}
}
