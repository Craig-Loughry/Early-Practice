
public class SalariedEmployee extends Employee {
	
	private double salary;


	@Override
	public String toString() {
		return "SalariedEmployee" + salary;
	}
	public SalariedEmployee(){
		
	}
	public SalariedEmployee(String name, long ssn, String paymethod) {
		super(name, ssn, paymethod);
		
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void informationSum() {
		
		
	}

}
