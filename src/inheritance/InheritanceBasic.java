package inheritance;

public class InheritanceBasic {

	public static void main(String[] args) {
		child ch=new child();
		ch.B();
	//	---------------------------------------------------------
		 Parents pa=new  Parents();
		 pa.A();
	}
}
class Parents
{
	public void A() {
		System.out.println(" I am in parent class");
	}
}
class child
{
	public void B() {
		System.out.println(" I am in Child class");
	}
}


	   
