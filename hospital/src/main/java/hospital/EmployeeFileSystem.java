package hospital;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFileSystem {
	private ArrayList<Employee> listEmployees = new ArrayList<>();

	public EmployeeFileSystem() {
		// this.listEmployees = listEmployees;
	}

	public void add(Employee e) {
		listEmployees.add(e);
	}

	public void remove(String emplName) {
		for (int i = 0; i < listEmployees.size(); i++) {
			if (emplName.equalsIgnoreCase(listEmployees.get(i).getName())) {
				listEmployees.remove(i);
			}
		}
	}

	public Employee getEmployee(String employeeName) {
		Employee employeeToGet = null;
		for (int i = 0; i < listEmployees.size(); i++) {

			if (employeeName.equalsIgnoreCase(listEmployees.get(i).getName())) {
				employeeToGet = listEmployees.get(i);
			}
		}
		return employeeToGet;

	}

	public String getSalaries() {
		String employeeSalaries = "Employee Salaries:\n";
		for (int i = 0; i < listEmployees.size(); i++) {

			int salary = listEmployees.get(i).calculatePay();
			String name = listEmployees.get(i).getName();
			employeeSalaries = employeeSalaries + name + " receives a salary of $" + salary + " per year\n";

		}
		return employeeSalaries;
	}

	public String basicEmployeeInfo() {
		String employeeInfo = "Current Employees:\n";
//		for (Employee e : listEmployees) {
//			if (e instanceof Doctor) {
//
//				employeeInfo += ((Doctor) e).toString();
//			}
//			if (e instanceof Nurse) {
//
//				employeeInfo += ((Nurse) e).toString();
//			}
//			if (e instanceof Surgeon) {
//
//				employeeInfo += ((Surgeon) e).toString();
//			}
//			if (e instanceof Janitor) {
//
//				employeeInfo += ((Janitor) e).toString();
//			}
//			if (e instanceof VampireJanitor) {
//
//				employeeInfo += ((VampireJanitor) e).toString();
//			}
//			if (e instanceof Receptionist) {
//
//				employeeInfo += ((Receptionist) e).toString();
//			}
//
//		}
//		return employeeInfo;

		for (int i = 0; i < listEmployees.size(); i++) {

			employeeInfo += listEmployees.get(i).toString();
			// String name = listEmployees.get(i).getName();
			// employeeSalaries = employeeSalaries + name + " receives a salary of $" +
			// salary + " per year\n";

		}
		return employeeInfo;
	}
	// }

	public String canDrawBlood() {
		String drawBlood = "List of Employees able to Draw Blood\n";
		for (Employee e : listEmployees) {
			if (e instanceof Doctor) {

				drawBlood += ((Doctor) e).getName() + " is capable of drawing blood\n";
			}
			if (e instanceof Nurse) {

				drawBlood += ((Nurse) e).getName() + " is capable of drawing blood\n";

			}
//			if (e instanceof Surgeon) {
//
//				drawBlood += ((Surgeon) e).getName() + " is capable of drawing blood\n";
//
//			}
			if (e instanceof VampireJanitor) {
				drawBlood += ((VampireJanitor) e).getName() + " is capable of drawing blood\n";
			}
		}
		return drawBlood;
	}

	public String canCareForPatients() {
		String careForPatients = "List of Employees able to Care for Patients\n";
		for (int i = 0; i < listEmployees.size(); i++) {
			if (listEmployees.get(i) instanceof Doctor) {

				careForPatients += ((Doctor) listEmployees.get(i)).getName() + " is able to care for patients\n";
			}
			if (listEmployees.get(i) instanceof Nurse) {

				careForPatients += ((Nurse) listEmployees.get(i)).getName() + " is able to care for patients\n";

			}
//			if (listEmployees.get(i) instanceof Surgeon) {
//
//				careForPatients += ((Surgeon) listEmployees.get(i)).getName() + " is able to care for patients\n";
//
//			}
		}
		return careForPatients;
	}

	public ArrayList<Employee> listEmployeesByJob(String jobTitle) {
		ArrayList<Employee> listEmployeesByJob = new ArrayList<>();
		if (jobTitle.equalsIgnoreCase("nurse"))
			for (Employee e : listEmployees) {

				if (e instanceof Nurse) {

					listEmployeesByJob.add(e);

				}
			}
		else if (jobTitle.equalsIgnoreCase("doctor"))
			for (Employee e : listEmployees) {

				if (e instanceof Doctor) {

					listEmployeesByJob.add(e);
				}
			}
		else if (jobTitle.equalsIgnoreCase("surgeon"))
			for (Employee e : listEmployees) {

				if (e instanceof Surgeon) {

					listEmployeesByJob.add(e);
				}
			}
		else if (jobTitle.equalsIgnoreCase("Receptionist"))
			for (Employee e : listEmployees) {

				if (e instanceof Receptionist) {

					listEmployeesByJob.add(e);
				}
			}
		else if (jobTitle.equalsIgnoreCase("Janitor"))
			for (Employee e : listEmployees) {

				if (e instanceof Janitor) {

					listEmployeesByJob.add(e);
				}
			}
		else if (jobTitle.equalsIgnoreCase("Vampire"))
			for (Employee e : listEmployees) {

				if (e instanceof VampireJanitor) {

					listEmployeesByJob.add(e);
				}
			}

		return listEmployeesByJob;

	}

}
