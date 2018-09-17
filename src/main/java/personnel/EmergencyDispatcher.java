package personnel;

public class EmergencyDispatcher extends Receptionist implements MedicalDuties {

	public EmergencyDispatcher(String empName, int empNumber, boolean isOnPhone) {
		super(empName, empNumber, isOnPhone);
	}

	@Override
	public void drawBlood() {

	}

	@Override
	public void careForPatient(Patient patient) {
		patient.healthCare(5);
	}

}
