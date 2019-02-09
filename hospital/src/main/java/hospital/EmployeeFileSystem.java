package hospital;

import java.util.ArrayList;

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
		for (Employee e : listEmployees) {
			if (e instanceof Doctor) {

				employeeInfo += ((Doctor) e).toString();
			}
			if (e instanceof Nurse) {

				employeeInfo += ((Nurse) e).toString();
			}
			if (e instanceof Surgeon) {

				employeeInfo += ((Surgeon) e).toString();
			}
			if (e instanceof Janitor) {

				employeeInfo += ((Janitor) e).toString();
			}
			if (e instanceof VampireJanitor) {

				employeeInfo += ((VampireJanitor) e).toString();
			}
			if (e instanceof Receptionist) {

				employeeInfo += ((Receptionist) e).toString();
			}

		}
		return employeeInfo;
	}

}
