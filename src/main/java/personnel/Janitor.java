package personnel;

public class Janitor extends Employee {

	private boolean isSweeping;

	public boolean getIsSweeping() {
		return isSweeping;
	}

	public Janitor(String empName, int empNumber, boolean isSweeping) {
		super(empName, empNumber);
		this.isSweeping = isSweeping;
	}

	@Override
	public int calculatePay() {
		return 40000;
	}


}
