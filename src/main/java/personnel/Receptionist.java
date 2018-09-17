package personnel;

public class Receptionist extends Employee {

	private boolean isOnPhone;

	public boolean getIsOnPhone() {
		return isOnPhone;
	}
	
	public Receptionist(String empName, int empNumber, boolean isOnPhone) {
		super(empName, empNumber);
		this.isOnPhone = isOnPhone;
	}

	public int calculatePay() {
		return 45000;
	}


}
