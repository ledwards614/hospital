package hospital;

public class Doctor extends Employee implements DrawBloodInterface, CareForPatientInterface {

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
		String stats = super.toString() + " " + getSpecialty() + "\n";
		return stats;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.decreaseBlood();

	}

	@Override
	public void careForPt(Patient patient) {
		patient.increaseHealth();

	}

}
