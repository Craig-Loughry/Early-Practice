
public class Employee {

	private String name;
	private long ssn;
	private String paymethod;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + ", paymethod=" + paymethod + "]";
	}
	public Employee() {
		super();
	}
	public Employee(String name, long ssn, String paymethod) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.paymethod = paymethod;
	}
	public long getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public String getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;

	}
	public void pay()
	{  System.out.println("DD");
	
	}
	public void informationSum(String Name, String paymethod, String pay) {
		System.out.printf(name, paymethod, pay);
	}
	}

	
	