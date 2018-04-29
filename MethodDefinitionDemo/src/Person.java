
public class Person {
	private String name;
	private char sex; // "m" or "f"
	private int age;
	private int hairLength;
	
	public Person() {
		super();
		name = "";
		sex = ' ';
		age = 0;
		hairLength = 0;
	}

	public Person(String name, char sex, int age, int hairLength) {
		super();
//		this.name = name;
	//	this.sex = sex;
//		this.age = age;
	//	this.hairLength = hairLength;
		setName(name);
		setSex(sex);
		setAge(age);
		setHairLength(hairLength);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHairLength() {
		return hairLength;
	}

	public void setHairLength(int hairLength) {
		this.hairLength = hairLength;
	}
	
	public void getHaircut(int inches) throws Exception {
		if (inches <= hairLength)
		hairLength -= inches; 
		else
			throw new Exception("You goofball, you can't cut that much off!");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + ", hairLength=" + hairLength + "]";
	}
	public String print() {
		return "Person print method: "+ name +" , "+ sex +", "+ age;
	}
	
	
}
