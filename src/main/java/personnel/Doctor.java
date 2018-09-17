package personnel;

public class Doctor extends Employee {

	protected String speciality;
	
	public String getSpeciality() {
		return speciality;
	}
	
	public Doctor(String empName, int empNumber, String speciality) {
		super(empName, empNumber);
		this.speciality = speciality;
	}

	public int calculatePay() {
		return 90000;
	}
	
	

}
