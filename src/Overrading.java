
public class Overrading{

		public Overrading(int i, int j) {
		// TODO Auto-generated constructor stub
	}
		public Overrading() {
			// TODO Auto-generated constructor stub
		}
		void  Overrading(int a,int b)
		{
			System.out.println(a+b);
		}
		 void  Overrading(int a,double b)
		 {
		 	System.out.println(a+b);
		}
		 void  Overrading(int a,int b,int c)
		 {
		 	System.out.println(a+b+c);
		 }
		 void  Overrading(double a,int b)
		 {
		 	System.out.println(a+b);
	}


   public static void main(String[] args) {
	   Overrading ov=new Overrading();
			ov.Overrading(10.50,20);
			ov.Overrading(25, 75.55);
			ov.Overrading(55, 77);
			ov.Overrading(70, 90,110);
			}
			}
