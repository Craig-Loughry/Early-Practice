
public class Dog extends Animal {

	String breed; 
	int age; 
	
	public void eat()
	{
		System.out.println("dog is eating");

	}
	public boolean bark(String level)
	{
		System.out.println("dog is barking" + level);
		return true; 
	}
}
