package Interface;

interface abc
{
	int x=150;
	void m11();
}
interface xyz
{
	int y=250;
	void m21();
}

public class Mulinterfce implements abc,xyz
{

	public void m11()
	{
		System.out.println(x);
	}
	public void m21()
	{
		System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mulinterfce test = new Mulinterfce();
		test.m11();
		test.m21();
		
	}

		
	}


