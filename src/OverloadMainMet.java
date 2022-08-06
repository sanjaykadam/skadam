
public class OverloadMainMet {

	void main (int x) 
	{
		System.out.println(x);
	}
	void main (int x,int y) 
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		OverloadMainMet ma=new OverloadMainMet();
//		ma.main(25);
//        ma.main(20, 30);
		
		ma.main(30);
		ma.main(10,30);
		
		
	}

}
