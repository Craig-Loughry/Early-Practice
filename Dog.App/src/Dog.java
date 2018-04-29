
public class Dog {
	
	private String name;
	private int age;
	private int weight; 

     public Dog() {
     super(); 
     name = " ";
     age = 0;
     weight = 0; 
     }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;

	}
	public void gainWeight() {
		weight++; 
		
	}
	public void gotOlder() {
		age++; 
	}	
	public void pees() {
		weight--;
	}
	
	public Dog(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public 
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	}
