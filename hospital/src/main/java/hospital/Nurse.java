package hospital;

import java.util.ArrayList;
import java.util.Collection;

public class Nurse extends Employee implements DrawBloodInterface, CareForPatientInterface {
	private int NURSE_SALARY = 50000;
	private int salary;

	// List of Patients
	ArrayList<Patient> patientList = new ArrayList<>();

	public Nurse(String name, int idNum) {
		super(name, idNum);
		this.salary = NURSE_SALARY;
	}

	public void admitPatient(Patient patient) {
		patientList.add(patient);

	}

	public int getLength() {
		return patientList.size();
	}

	public void releasePatient(String patientName) {
		for (int i = 0; i < patientList.size(); i++) {
			if (patientName.equalsIgnoreCase(patientList.get(i).getName())) {
				patientList.remove(i);
			}
		}
	}

	public void tickAll() {
		for (int i = 0; i < patientList.size(); i++) {
			patientList.get(i).tick();
		}
	}

	@Override
	public void careForPt(Patient patient) {

		patient.increaseHealth();
	}

	public void careForAllPatients() {
		for (Patient p : patientList) {
			p.increaseHealth();
		}

	}

	/**
	 * Returns a patient through name selection
	 * 
	 * @param name the name of patient
	 * @return the Patient Object
	 */
	public Patient getPatient(String patientName) {
		for (int i = 0; i < patientList.size(); i++) {
			if (patientName.equalsIgnoreCase(patientList.get(i).getName())) {
				return patientList.get(i);
			}
		}
		return null;

	}

	public Collection<Patient> listPatients() {
		// String listOfPt = "Patients: ";
		// for (int i = 0; i < patientList.size(); i++) {
		// listOfPt = patientList.get(i).getName() + ", ";
		// }
		return patientList;
	}

	@Override
	public String toString() {
		String stats = super.toString() + " " + listPatients() + "\n";
		return stats;
	}

	@Override
	public int calculatePay() {
		return NURSE_SALARY;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.decreaseBlood();

	}

}
