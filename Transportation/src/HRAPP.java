
public class HRAPP {

	public static void main(String[] args) {
		
		SalariedEmployee j = new SalariedEmployee();
		
		j.setName("John");
		j.setSsn(555555555);
		j.setPaymethod("direct");
		j.setSalary(35000);
		j.informationSum();
		j.pay();
	
		
		
		SalariedEmployee ja = new SalariedEmployee("", 444444, "dd");
		System.out.println(ja.toString());
		
		
		
		ContractEmployee jim = new ContractEmployee("jim", 333333, "DD");
		System.out.println(jim.toString());
		
		
		
	}

}
