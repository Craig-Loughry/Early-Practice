
public class Employee {

String name;
String height;
String hairColor;
String job;

public void hired() {
	System.out.println("Yayy, I'm employed");
}
public void working() {
	System.out.println("Man, I need a new job");
}
public boolean fired(String work) {
	System.out.println("Fired?! I Quit! "+ work);
	return true; 
}
}
