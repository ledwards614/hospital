package hospital;


public class Patient {
	//I think health and blood levels may increment by 20 and 10
	private static final int BLOOD_LEVEL = 20;
	private static final int HEALTH_LEVEL = 10;
	private int currentBloodLevel;
	private int currentHealth;
	private String name;
	
	//logic for constructor:
	//when pt is admitted to hopsital vitals are checked (blood, health)
	//then as time goes by health and blood increase or decrease based on 
	//diffent employees interaction. but only through contstants BLOOD_LEVEL and HEALTH_LEVEl
	//can the stats be altered
	public Patient(String name, int currentBloodLevel, int currentHealth ) {
		this.name = name;
		this.currentBloodLevel = currentBloodLevel;
		this.currentHealth = currentHealth;
	}
	/**
	 * Patient gets admitted to hospital with default values
	 * @param name the patients name
	 */
	public Patient(String name) {
		this.name = name;
		this.currentBloodLevel = BLOOD_LEVEL;
		this.currentHealth = HEALTH_LEVEL;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
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
	 * As time passes without pt care pt health decreases by 10
	 */
	 public void tick() {
		 currentHealth -= HEALTH_LEVEL;
	 }
	
	 public String toString() {
		 return this.getName() + "";
		 
	 }

}
