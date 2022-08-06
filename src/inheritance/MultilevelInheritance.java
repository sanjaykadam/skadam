package inheritance;

class A 
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A 
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}
	class C extends B {
		int c;
		void show() {
			System.out.println("c");
		}
	}	
public class MultilevelInheritance {

	public static void main(String[] args) {
	

		C cobj=new C();
		cobj.a=15;
		cobj.b=25;
		cobj.c=35;
		
		cobj.display();
		cobj.print();
		cobj.show();
	}

}
