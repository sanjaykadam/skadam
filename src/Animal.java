
public class Animal {

	String colour="white";
	
	void eating() {
		System.out.println("eating.....");
	}
}
class Dog extends Animal 
{
	String colour="Black";

  void Displaycolour()
  {
	System.out.println(colour);  
	System.out.println(super.colour); 
  }

void eating() {
 System.out.println("Eating Bread......");
 super.eating();
}
}
