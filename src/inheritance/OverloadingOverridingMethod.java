package inheritance;

class Bank
{
	 double rateofInterest()
	 {
		return 0;
		
	}
}
    class SBI extends Bank
    {
    	double rateofInterest() {
    		
    	return 10.5;
    }
    }
    class ICICI extends Bank
    {
    	  double rateofInterest() {
    		  
    		  {
    		return 9.7;
    }
    }
    class AXIS extends Bank{
    	
    
    double rateofInterest() 
    {
	return 8.5;
    }
    	
    }


public class OverloadingOverridingMethod {

	public static void main(String[] args) {
		
   SBI sbi=new SBI();
   System.out.println(sbi.rateofInterest());
		
   ICICI icici=new ICICI();
   System.out.println(icici.rateofInterest());
		
		
		
	}

}
}