

	
	class bank
	{
		double rateofInterrance() 
		{
			return 0;
		}
	}
	class sbi extends bank
	{
		double rateofInterrance() 
		{
			return 10.55;
	}
	}
	class icici extends bank
	{
		double rateofInterrance() 
		{
			return 20.75;
		}
	}
		class axis extends bank
		{
			double rateofInterrance() 
			{
				return 3.50;
		}
		}
		public class MethodOverriding {
	public static void main(String[] args) {

		sbi s=new sbi();
		 System.out.println(s.rateofInterrance());

		 
		 icici ic=new icici();
		System.out.println( ic.rateofInterrance());
		
		axis a=new axis();
		System.out.println(a.rateofInterrance());
	}

}
	
	