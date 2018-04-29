
public class AnimalApp {
	
	public static void Main(String[] args) {
	
	Dog myDog;
	
	myDog = new Dog();
	myDog.breed = "Fido";
	myDog.age = 12;
	myDog.bark("soft");
			
	
	
	Cat myCat = new Cat();
	myCat.favoriteFood = "Garfield";
	myDog.bark("high");
	myCat.favoriteFood = "Lasagna";
	
	System.out.println(myCat.favoriteFood);
	System.out.println(myDog.age);
	
	Bird myBird = new Bird();
	
	myBird.sings();
	myBird.fly();
	
	
}
}