package hospital;

public class Surgeon extends Doctor implements DrawBloodInterface, CareForPatientInterface{
	
	private int SURGEON_SALARY = 120000;
	private boolean isOperating;

	public Surgeon(String name, int idNum, String specialty) {
		super(name, idNum, specialty);
		isOperating = false;
	}
	
	@Override
	public int calculatePay() {
		return SURGEON_SALARY;
	}

	public boolean getIsOperating() {
		return isOperating;
	}
	
	public void toggleIsOperating() {
		isOperating = !isOperating;
	}
	
	@Override
		public void careForPt(Patient patient) {		
			patient.increaseHealth();	
		}
	

	@Override
	public void drawBlood(Patient patient) {
		patient.decreaseBlood();
		
	}

	@Override
	public String toString() {
		String stats = getClass().getSimpleName() + ": " + getName() + " " + getId() + " " + getSpecialty() + " " + getIsOperating() + "\n";
		return stats;
	}


}
