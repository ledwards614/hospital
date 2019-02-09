package hospital;

public class Doctor extends Employee implements DrawBloodInterface, CareForPatientInterface{
	
	private int DOCTOR_SALARY = 90000;
	private String specialty;

	
	public Doctor(String name, int idNum) {
		super(name, idNum);
		
	}	

	public Doctor(String name, int idNum, String specialty) {
		super(name, idNum);
		this.specialty = specialty;
	}
	
	public String getSpecialty() {
		return specialty;
	}



	@Override
	public int calculatePay() {
		
		return DOCTOR_SALARY;
	}
	
	@Override
	public String toString() {
		String stats = "Doctor: " + getName() + " " + getId() + " " + getSpecialty();
		return stats;
	}

	@Override
	public void careForPatient() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawBlood() {
		// TODO Auto-generated method stub
		
	}

	

}
