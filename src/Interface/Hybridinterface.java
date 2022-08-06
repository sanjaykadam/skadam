package Interface;

class A {
	 
	void m1()
	{
		System.out.println("this is  m1 methos from a1 class");
	}
	
}
interface B1
{
	void m2();
}

interface B2
{
	void m3();
	
}


public class Hybridinterface extends A implements B1,B2 {
	
	//public void m1{
		//System.out.println("this is m1 method from class");
	
	public void m2() {
		System.out.println("this is m2 method from interface");
	}
   public void m3() {
	   System.out.println("this is m3 mrthod from interface");
   }
	public static void main(String[] args) {
		
		Hybridinterface m=new Hybridinterface();
		m.m1();
		m.m2();
		m.m3();
	}

}
