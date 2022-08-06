
public class OverloadingMethod {

	void add(int a,int b)
	{
		System.out.println(a+b);
		}
	void add(int a,double b)
	{
		System.out.println(a+b);
	}
	void add(double a,double b)
	{
		System.out.println(a+b);
	}
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void add(double a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		OverloadingMethod mo=new OverloadingMethod();
		mo.add(30, 20);
		mo.add(30, 30);
		mo.add(30, 40);
		mo.add(30, 50);
		mo.add(20, 30, 40);

	}

}
