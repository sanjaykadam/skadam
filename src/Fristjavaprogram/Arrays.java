package Fristjavaprogram;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*int arraydemo[];
		arraydemo =new int[10];
	
		int arrayvalues[]= {10,20,30,40,50,60,70,80,90,100};
	
		//System.out.println(arrayvalues[0]);
		
		for (int i=0 ; i<=9; i++) {
	
		System.out.print(arrayvalues[i]+ " ");*/
		
		/*int arraydemo[]= new int[10];
		
		Scanner sc=new Scanner (System.in);
		
		for(int x=0 ;x<=9 ;x++) {
			System.out.println("enter the value at index "+x);
			int abc=sc.nextInt();
			arraydemo[x]=abc;
			
		}
		for(int y=0; y<=9 ; y++) {
			System.out.print(arraydemo[y]+"  ");*/
	
		
	/*	int array[]=new int[5];
int result=0;
		Scanner sc=new Scanner(System.in);
		
		for(int x=0 ; x< 5 ; x++) {
			System.out.println("enter the value on index "+x);
			int value =sc.nextInt();
			array[x]=value;
		}
		for (int y=0 ; y<5 ; y++) {
			result =result+array[y];
		}
		System.out.println(result);*/
		
		
		/*int array[]=new int[10];
		int result=0;
		Scanner sc=new Scanner(System.in);
		
			
		for (int x=0;x<10;x++) {
			
			
			System.out.println("Enter values on index");
			array[x]=sc.nextInt();
			
		}
       for( int y=0 ; y<10 ; y++) {
    	   if(result > array[y]) {
    		   result=result;
    	   }
    	   else {
    		   result=array[y];
    	   }
       }
   System.out.println("greater no is "+result);*/
		
		/*Scanner sc=new Scanner(System.in);
		int userinput[]=new int [10];
		int temp;
		int even=0;
		int odd=0;
		
		
		for (int a=0 ; a <10 ; a++) {
			System.out.println("enter the values on index"+a);
			temp=sc.nextInt();
			userinput[a]=temp;
			if(temp%2==0) {
				even=even+temp;
			
			}
			else {
			odd=odd+temp;
		
		}
		}
		System.out.println(even);
		System.out.println(odd);*/
	
		
	/*Scanner sc=new Scanner(System.in);
	int useri[]=new int[10];
	int save;
	int result=0;
	int avg=0;
	
	for (int a=0 ; a<10 ; a++) {
	System.out.println("enter the age on index"+a);
	save=sc.nextInt();
	useri[a]=save;
	
	}
	for(int b=0 ;b< 10 ; b++) {
		result=result+useri[b];
		
	}
		avg=result/10;
		System.out.println(result);
		System.out.println(avg);*/
		
	
       Scanner sc=new Scanner(System.in);	
       int useri[]=new int[10];
       int temp=0;
       int result=0;
      
       int avg;
       
;       for(int a=0 ;a <10 ;a++) {
    	   System.out.println(" enter any age on index "+a);
    	   useri[a]=temp;
    	   temp=sc.nextInt();
            }
    	   for(int b=0 ; b<10 ; b++) {
    		result=result+useri[b];   
    		   
    	   }
    	   avg=result/10;
		System.out.println(result);
		System.out.println(avg);
		

	
}
}