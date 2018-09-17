package personnel;

public class Patient {
	
	private final int DEFAULT_BLOOD_LEVEL = 20;
	private final int DEFAULT_HEALTH_LEVEL = 10;

	private int healthLevel = DEFAULT_HEALTH_LEVEL;
	private int bloodLevel = DEFAULT_BLOOD_LEVEL;

	public int getBloodLevel() {
		return bloodLevel;
	}
	
	public int getHealthLevel() {
		return healthLevel;
	}
	
	protected void removeBlood() {
		bloodLevel -= 5;
	}
	
	protected void receiveHealthCare(int value) {
		healthLevel += value;
	}

}
