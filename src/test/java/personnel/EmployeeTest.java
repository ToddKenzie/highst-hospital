package personnel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void verifyPhilHasBrainSpeciality() {
		Doctor underTest = new Doctor("Phil", 111, "Brain");
		String speciality = underTest.getSpeciality();
		assertThat(speciality, is("Brain"));
	}

	@Test
	public void verifyPhilMakes90000() {
		Doctor underTest = new Doctor("Phil", 111, "Brain");
		int pay = underTest.calculatePay();
		assertThat(pay, is(90000));
	}

	@Test
	public void verifyHarryIsInSurgery() {
		Surgeon underTest = new Surgeon("Harry", 222, "Plastic", true);
		boolean operating = underTest.getIsOperating();
		assertThat(operating, is(true));
	}

	@Test
	public void verifyHarryMakes120000() {
		Surgeon underTest = new Surgeon("Harry", 222, "Plastic", true);
		int pay = underTest.calculatePay();
		assertThat(pay, is(120000));
	}

	@Test
	public void verifyJanineIsOnThePhone() {
		Receptionist underTest = new Receptionist("Janine", 444, true);
		boolean onPhone = underTest.getIsOnPhone();
		assertThat(onPhone, is(true));
	}

	@Test
	public void verifyJanineMakes45000() {
		Receptionist underTest = new Receptionist("Janine", 444, true);
		int pay = underTest.calculatePay();
		assertThat(pay, is(45000));
	}

	@Test
	public void verifyRosieIsSweeping() {
		Janitor underTest = new Janitor("Rosie", 555, true);
		boolean sweeping = underTest.getIsSweeping();
		assertThat(sweeping, is(true));
	}

	@Test
	public void verifyRosieMakes40000() {
		Janitor underTest = new Janitor("Rosie", 555, true);
		int pay = underTest.calculatePay();
		assertThat(pay, is(40000));
	}

	@Test
	public void verifyJackieMakes50000() {
		Nurse underTest = new Nurse("Jackie", 333, 6);
		int pay = underTest.calculatePay();
		assertThat(pay, is(50000));
	}

	@Test
	public void verifyJackieHas6Patients() {
		Nurse underTest = new Nurse("Jackie", 333, 6);
		int patients = underTest.getPatientsInCare();
		assertThat(patients, is(6));
	}
	
	@Test
	public void verifyJackieIncreasesPatientHealthFrom10to15() {
		Nurse underTest = new Nurse("Jackie", 333, 6);
		Patient zero = new Patient();
		underTest.careForPatient(zero);
		int health = zero.getHealthLevel();
		assertThat(health, is(15));
	}
	
	@Test
	public void verifyHarryIncreasesPatientHealthFrom10to20() {
		Surgeon underTest = new Surgeon("Harry", 222, "Plastic", true);
		Patient zero = new Patient();
		underTest.careForPatient(zero);
		int health = zero.getHealthLevel();
		assertThat(health, is(20));
	}
	
	@Test
	public void verifyPatientHas20Blood() {
		Patient zero = new Patient();
		int blood = zero.getBloodLevel();
		assertThat(blood, is(20));
	}
	
	@Test
	public void assertTinaIsAnEmergencyDispatcher() {
		EmergencyDispatcher underTest = new EmergencyDispatcher("Tina", 666, true);
		int pay = underTest.calculatePay();
		assertThat(pay, is(45000));
	}

}
