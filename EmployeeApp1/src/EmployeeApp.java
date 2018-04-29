
public class EmployeeApp {

	public static void main(String[] args) {
		
Employee E;
E = new Employee(); 
E.name = "Earl";
E.hairColor = "Brown hair";
E.height = "Tall";
E.job = "Manager";

System.out.println(E.name +" With the "+ E.hairColor + " who is " + E.height +" and a " + E.job + " said ");
E.hired();
E.working();
E.fired("Dang");
	}

}
