package personnel;

public class Surgeon extends Doctor implements MedicalDuties {

	private boolean isOperating;

	public boolean getIsOperating() {
		return isOperating;
	}

	public Surgeon(String empName, int empNumber, String speciality, boolean isOperating) {
		super(empName, empNumber, speciality);
		this.isOperating = isOperating;
	}

	public int calculatePay() {
		return 120000;
	}

	public void careForPatient(Patient patient) {
		patient.receiveHealthCare(10);
	}
	
	public void drawBlood(Patient patient) {
		patient.removeBlood();
	}

}
