package hospital;

import java.util.ArrayList;
import java.util.Collection;

public class Nurse {
	private String name;
	private int idNum;
	private int NURSE_SALARY = 50000;

	// List of Patients
	ArrayList<Patient> patientList = new ArrayList<>();

	public Nurse(String name, int idNum) {
		this.name = name;
		this.idNum = idNum;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return idNum;
	}

	public int calculatePay() {
		// TODO Auto-generated method stub
		return NURSE_SALARY;
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

	public void careForPt(String patientName) {		
		Patient ptToCareFor = this.getPatient(patientName);
		ptToCareFor.increaseHealth();	
	}
/**
 * Returns a patient through name selection
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
		String listOfPt = "Patients: ";
		for (int i = 0; i < patientList.size(); i++) {
			listOfPt = patientList.get(i).getName() + ", ";
		}
		return patientList;
	}
	
	@Override
	public String toString() {
		String stats = "Nurse: " + name + " " + idNum + " " + listPatients();
		return stats;
	}


}
