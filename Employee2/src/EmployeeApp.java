public abstract class EmployeeApp {

	public static void main(String[] args) {
		
		
Bill b = new Bill();
Mary m = new Mary();
Jane j = new Jane(); 

b.name = "Bill";
b.age = 40; 
b.hobby = "Knitting";
System.out.println("Hi, I'm " + b.name +" and I'm "+ b.age + " years young!");
b.Boss();
b.Knit();
System.out.println();

m.name = "Mary";
m.Cool();
m.travel = "Italy";
m.Gone();
System.out.println("in " + m.travel);
System.out.println();


j.name = "Jane";
j.age = 100;
j.workout = "marathons!";
System.out.println("My name is "+ j.name +" and I'm "+ j.age+ "!!!");
j.Gym();
j.Bored();
	}

}
