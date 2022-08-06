

interface ABC
{
	int a=10;
	
	void m();
}


public class Test implements ABC{
	
	public void m()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		
		Test t=new Test();
		t.m();

		
		/*A a=new Test();
		a.m();*/
	}

}
