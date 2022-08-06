
public class StaticExample {

		
		static int a=10;
		int b=20;
		
		static void m1() 
		{
			System.out.println("this is m1-static method");
		}
		 void  m2()
		{
			
			System.out.println("this is m2- Non static method");
		}
		 void m3()
		 {
			 System.out.println("this is m3 method --------non static----");
			 System.out.println(a);
			 System.out.println(b);
			 m1();
			 m2();
		 }
		
		public static void main(String[] args) {
			
//			System.out.println(a);
//			m1();
//			
//			
		StaticExample se=new StaticExample();
//			System.out.println(se.b);
//			
			se.m3();
			
			
	}

}
