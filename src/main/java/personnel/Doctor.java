package personnel;

public class Doctor extends Employee implements MedicalDuties{

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

	public void careForPatient(Patient patient) {
		patient.receiveHealthCare(10);
	}

	public void drawBlood(Patient patient) {
		patient.removeBlood();
	}
	
	

}
