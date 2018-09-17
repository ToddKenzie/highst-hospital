package personnel;

public class Patient {

	private int healthLevel;
	private int bloodLevel;

	public int getBloodLevel() {
		return bloodLevel;
	}
	
	public int getHealthLevel() {
		return healthLevel;
	}
	
	public Patient() {
		bloodLevel = 20;
		healthLevel = 10;
	}
	
	protected void healthCare(int value) {
		healthLevel += value;
	}

}
