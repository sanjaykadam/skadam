package edureka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayslistExp {

	/*public static void main(String[]args) {
	ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
    list.add("AMOL");
    list.add("Sanjay");
    list.add("Kishor");
    list.add("Kiran");
    list.add("Achyut");
    //Traversing list through Iterator 
    
    Iterator itr=list.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next()); */ 
	
	 public static void main(String[] args) {
	        
	        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	        list.add("Rachel");//Adding object in arraylist  
	        list.add("Avi");  
	        list.add("John");  
	        list.add("Nick");
	        
	        System.out.println("ArrayList before sorting:" + list);
	        
	        // Sorting list element using sort() method
	        Collections.sort(list);
	        
	        System.out.println("ArrayList after sorting:" + list);
	        
	        //shuffle rearrange the list elements
	        Collections.shuffle(list);
	        
	        System.out.println("ArrayList after Suffling:" +list);
	        
	        Collections.sort(list);
	        System.out.println("Arraylist after Sort " +list);
	     /* Collections.emptyList();
	      System.out.println("Arraylist after emptylist " +list);*/
	        
	        
	        
	        
	        
	    }
}
