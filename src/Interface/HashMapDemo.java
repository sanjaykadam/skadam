package Interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();

		//adding pairs into hashmap
		
		hm.put(101, "sanjay");
		hm.put(102, "kiran");
		hm.put(103, "achyut");
		hm.put(104, "kishor");
		hm.put(105, "amol");
		
		System.out.println(hm);
		
		hm.remove(103);
		System.out.println(hm);
		 hm.put(107,"ravi");
		 System.out.println(hm);
		 
		 System.out.println(" all of us are my family member ");
		 for(Map.Entry m:hm.entrySet()) {
			 System.out.println(m.getKey()+" "+m.getValue());
			
		 }
		 
		 
	}

}
