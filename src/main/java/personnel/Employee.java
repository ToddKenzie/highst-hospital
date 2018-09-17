package personnel;

public abstract class Employee {
	
	private String empName;
	private int empNumber;
	
	public String getEmpName() {
		return empName;
	}
	
	public int getEmpNumber() {
		return empNumber;
	}
	
	
	public Employee(String empName, int empNumber) {
		this.empName = empName;
		this.empNumber = empNumber;
	}
	
	public abstract int calculatePay();

}
