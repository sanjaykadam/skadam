
public class NEWCLASS1 {
	public NEWCLASS1(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public NEWCLASS1(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	public NEWCLASS1(int i, double d) {
		// TODO Auto-generated constructor stub
	}
	//Overloading
	
	
	/*void main(int a,int b)
	{
		System.out.println(a+b);
	}
	void main(int a,double b)
	{
		System.out.println(a+b);
	}
	void main(double a,double b)
	{
		System.out.println(a+b);
	}
	void main(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
	NEWCLASS1 NEW=new NEWCLASS1();	
	NEW.main(10, 20);
	NEW.main(15,25,35);
	NEW.main(10.5, 20.5);
	NEW.main(10, 15.5);*/
//CONSTRUCTOR OVERLOADING

 public NEWCLASS1(double d, int j) {
		// TODO Auto-generated constructor stub
	}
void Construtoroverloading(int a,int b)
{
	System.out.println(a+b);
}
 void Construtoroverloading(int a,double b)
 {
 	System.out.println(a+b);
}
 void Construtoroverloading(int a,int b,int c)
 {
 	System.out.println(a+b+c);
 }
 void Construtoroverloading(double a,int b)
 {
 	System.out.println(a+b);
 }

public static void main(String[]args) {
NEWCLASS1 co=new NEWCLASS1(10,20);
//NEWCLASS1 co1=new NEWCLASS1(10,20,30);
//NEWCLASS1 co2=new NEWCLASS1(10,20.5);
//NEWCLASS1 co3=new NEWCLASS1(10.50,20);

}
}
