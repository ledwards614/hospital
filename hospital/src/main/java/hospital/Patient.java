package hospital;

public class Patient {
	private static final int BLOOD_LEVEL = 20;
	private static final int HEALTH_LEVEL = 10;
	private int currentBloodLevel;
	private int currentHealth;
	private String name;

	/**
	 * logic for constructor: when patient is admitted to hospital vitals are
	 * checked (blood, health)
	 * 
	 * @param name
	 * @param currentBloodLevel
	 * @param currentHealth
	 */
	public Patient(String name, int currentBloodLevel, int currentHealth) {
		this.name = name;
		this.currentBloodLevel = currentBloodLevel;
		this.currentHealth = currentHealth;
	}

	/**
	 * Patient gets admitted to hospital with default values
	 * 
	 * @param name
	 */
	public Patient(String name) {
		this.name = name;
		this.currentBloodLevel = BLOOD_LEVEL;
		this.currentHealth = HEALTH_LEVEL;
	}

	public String getName() {
		return name;
	}

	public int getCurrentBlood() {
		return currentBloodLevel;

	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void decreaseBlood() {
		currentBloodLevel -= BLOOD_LEVEL;
	}

	public void increaseHealth() {
		currentHealth += HEALTH_LEVEL;
	}

	/**
	 * tick decreases health if patient is not being cared for regularly
	 */
	public void tick() {
		currentHealth -= 1;
	}

	public String toString() {
		return this.getName() + "";

	}

}
