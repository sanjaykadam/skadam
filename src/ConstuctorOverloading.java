
public class ConstuctorOverloading {


	ConstuctorOverloading(int a,int b)
	{
		System.out.println(a+b);
		}
	ConstuctorOverloading(int a,double b)
	{
		System.out.println(a+b);
	}
	ConstuctorOverloading(double a,double b)
	{
		System.out.println(a+b);
	}
	ConstuctorOverloading(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	ConstuctorOverloading(double a,int b)
	{
		System.out.println(a+b);
	}
	
	
	
	public static void main(String[] args) {
		ConstuctorOverloading co=new  ConstuctorOverloading(10,20);
		ConstuctorOverloading co1=new ConstuctorOverloading(10,30);
		ConstuctorOverloading co2=new ConstuctorOverloading(30,50);
		ConstuctorOverloading co3=new ConstuctorOverloading(20,70,30);
	    ConstuctorOverloading co4=new ConstuctorOverloading(80,20);
	
	
	}
}

