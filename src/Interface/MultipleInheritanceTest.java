package Interface;

interface abc{
	int a=100;
	void m1();
}
	interface xyz{
	int b=250;
	void m2();
}
public class MultipleInheritanceTest implements abc,xyz {
	
	public void m1() {
	 System.out.println(a);
	}
	public void m2() {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		MultipleInheritanceTest test= new MultipleInheritanceTest();
		test.m1();
		test.m2();
	}

}
