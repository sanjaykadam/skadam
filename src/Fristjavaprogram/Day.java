package Fristjavaprogram;

public class Day {
	public static void main(String args[]) {
	
   //primative datatypes
	int a=10;
	double d=20.5;
	char c='h';
	boolean b=false;
	//derived datatypes
	
	String s="welcome";
	
	System.out.println(a);
	System.out.println(d);
	System.out.println(c);
	System.out.println(b);
	System.out.println(s);
	
	//opratiors in java
	//1.ARITHMATICS  +  -  * /  %
	//2.RELATIONAL  == <>  <= >= !=
	//3.LOGICAL     && || !
	//4.INCREMENT/DECREMENT ++ -- 
	//5.ASSIGEMENT =
	
	
	int age=25;
	if (age>=20)
	{
		System.out.println(" eligiliable for vote");
	}
	else 
	{
		System.out.println("not eligiliable for vote");
		
		
		/*int abc=21;
		if (abc > 30)
		{
			System.out.println("we are in if condition");
			System.out.println("abc is greater than 20");
		}
		else 	
			System.out.println("abc is not greater than 20");*/
		/*int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
		
		
		System.out.print(arr[i][j]+" ");
			}
		
			System.out.println();*/

		int arr[][]= {{2,3,4,4},{1,8,9,5},{4,5,3,6}};
		for(int k=0; k<4; k++) {
	          for ( int l=0; l<4; l++) {
	
	System.out.print(arr[k][l]+"  ");
		
	          }          
	System.out.println();
	}
	

}
}
}