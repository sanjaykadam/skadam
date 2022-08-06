package javaPracticequestion;

public class Duplicatecharstring {
	  public static void main(String[] args) {    
//	        String string1 = "cannot changed";    
//	        int count;    
//	            
//	        //Converts given string into character array    
//	        char string[] = string1.toCharArray();    
//	            
//	        System.out.println("Duplicate characters in a given string: ");    
//	        //Counts each character present in the string    
//	        for(int i = 0; i <string.length; i++) {    
//	            count = 1;    
//	            for(int j = i+1; j <string.length; j++) {    
//	                if(string[i] == string[j] && string[i] != ' ') {    
//	                    count++;    
//	                    //Set string[j] to 0 to avoid printing visited character    
//	                    string[j] = '0';    
//	                }    
//	            }    
//	            //A character is considered as duplicate if count is greater than 1    
//	            if(count > 1 && string[i] != '0')    
//	                System.out.println(string[i]);    
//	        }    
//	    }    
//	}     

		  
		  
		  
		   String str = "89564542545112";
		      char[] carray = str.toCharArray();
		      System.out.println("The string is:" + str);
		      System.out.print("Duplicate Characters in above string are: ");
		      for (int i = 0; i < str.length(); i++) {
		         for (int j = i + 1; j < str.length(); j++) {
		            if (carray[i] == carray[j]) {
		               System.out.print(carray[j] + " ");
		               break;
		            }
		         }
		      }
		   }
}
//		  String str="machaniacal";
//		  char[] carr=str.toCharArray();
//		  System.out.println("The string is: "+str);
//		  System.out.println("duplicate charactres in above string are: ");
//		  for(int i=0 ;i<str.length();i++) {
//			  for(int j=i+1;j<str.length();j++) {
//				if(carr[i]==carr[j]) {
//					System.out.print(carr[j]+" ");
//					break;
//				}
//					
//				}
//			  }
//		  
//	  }
//}
//		  
		  
		  
		  
		  