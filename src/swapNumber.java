
public class swapNumber {

	public static void main(String[] args) {
		
		int a=10, b=15;
		
		//int a=10,b=15,c=0;
		System.out.println("before swaping two number "+a+" "+b);
		
//		a=a+b;//10+15=25
//		b=a-b;//25-15=10
//		a=a-b;//25-10=15
		
//		c=a;//10
//		a=b;//15
//		b=c;//10
//		
		a=a*b;//10*15=150
		b=a/b;//150/15=10
		a=a/b;//150/10=15
		
		
		System.out.println("after swaping two number "+a+" "+b);
	}

}
