package inheritance;

class parent 
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class Child1 extends parent
{
	int x;
	void show()
	{
		System.out.println(x);	
	}
}
class Child2 extends parent
{
	int y;
	void print()
	{
		System.out.println(y);
	}
}



public class HirearachyInheritance {

	public static void main(String[] args) {
	
		Child1 c1=new Child1();
		c1.a=100;
		c1.x=200;
		c1.display();
		c1.show();
		
		Child2 C2=new Child2	();
		C2.a=250;
		C2.y=300;
		C2.display();
		C2.print();
		
	}
}

