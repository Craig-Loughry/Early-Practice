
public class ContractEmployee extends Employee {

	private double hoursWorked;
	private double payRate;
	private double bonus;
	
	public ContractEmployee(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
	public double getPaid(double getPaid) {
		 return getPaid = (payRate*hoursWorked)+bonus;

	}
	public void setBonus() {
	}
	
	@Override
	public void pay()
{ System.out.println("MC");
}

}
		
	

