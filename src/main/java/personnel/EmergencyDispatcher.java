package personnel;

public class EmergencyDispatcher extends Receptionist implements MedicalDuties {

	public EmergencyDispatcher(String empName, int empNumber, boolean isOnPhone) {
		super(empName, empNumber, isOnPhone);
	}

	public void drawBlood(Patient patient) {
		patient.removeBlood();
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.receiveHealthCare(5);
	}

}
