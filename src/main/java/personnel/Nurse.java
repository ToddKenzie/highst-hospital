package personnel;

public class Nurse extends Employee implements MedicalDuties{

	private int patientsInCare;

	public int getPatientsInCare() {
		return patientsInCare;
	}

	public Nurse(String empName, int empNumber, int patientsInCare) {
		super(empName, empNumber);
		this.patientsInCare = patientsInCare;
	}

	@Override
	public int calculatePay() {
		return 50000;
	}

	public void careForPatient(Patient patient) {
		patient.healthCare(5);
	}

	@Override
	public void drawBlood() {
		
	}


}
