package Fristjavaprogram;

public class OPERATORS {

	public static void main(String[] args) {
		//1. ARATHIMATIC OPERATORS  +  -  *  / %
		
		/*int a=10;
		int b=20;
        int c=a+b;
        
        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        
      //2.(RELATIONAL/comparison) OPERATORS   == <>  <= >= !=
        // ALWAYS RETURN BOOLEAN VALUES
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        
       
        
        boolean x=true;
        boolean y=false;
        
     // 3.LOGICAL     && || !  
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(!x);
        System.out.println(!y);
        
      //4.INCREMENT/DECREMENT ++ --   
         a=10;
         a++;
         System.out.println(a);
         
         b=25;
         b--;
         System.out.println(b);
         
         
         // PRIMATIVE DATATYPES:-INT,BOOLEAN,DOUBLE,CHAR.
         //DERIVED DATATYPES:- STRING ,ARRAY.
         
         int e=55;
         int f=35;
         System.out.println(e+f);
         System.out.println(e-f);
         System.out.println(e*f);
         System.out.println(e/f);
         System.out.println(e%f);
         
         boolean g=true;
         boolean h=false;
         
         System.out.println(g&&h);
         System.out.println(g||h);
         System.out.println(!g);
         System.out.println(!h);
	
         
         /* double d=20.5;
          double j=30.5;
          System.out.println(d+j);

          char k='y';
          System.out.println(k);*/
         
		
		/*int n = 10;
		int A=0,B=1;
		
		System.out.println("fibonacci series till" + n +"terms");
		
		for(int i = 1; i <= n; ++i); {
			System.out.println(A+ ",");
			int c=A+B;
			A=B;
			B=c;
			System.out.println(A+ ","+ n);*/
		
		int n=20, fristterm=0,secondterm=1;
		System.out.println("fibonacci series till " + n +" terms");
	
		for(int i = 1; i <= n; ++i){
			System.out.print(fristterm+ ",");
			
			int nextterm=fristterm+secondterm;
		   fristterm=secondterm;
		   secondterm=nextterm;


		}

	}
}