
public class Overloadmainmethod {
	
	
	public void main(int x) {
		System.out.println(x);
	}
	public void main(int a,int b) {
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		Overloadmainmethod ov=new Overloadmainmethod();
		ov.main(200);
        ov.main(2035, 1020);
	}

}
