package Interface;

interface Z
{
	int a=10;
	int b=25;
	void m1();
}



public class Intclass1 implements Z
{
  public void  m1()
  {
	  System.out.println(a);
	  System.out.println(b);
  }
	public static void main(String[] args) {
	
//		Intclass1 t=new Intclass1();
//		t.m1();

		Z z=new Intclass1();
		z.m1();
	}
}
