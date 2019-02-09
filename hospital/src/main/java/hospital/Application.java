package hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Create List of Employees
		EmployeeFileSystem listEmployees = new EmployeeFileSystem();
		Nurse nurseOnDutyOne = new Nurse("Abby", 111);
		Doctor doctorOne = new Doctor("Victoria", 112, "OBGYN");
		Surgeon brainSurgeon = new Surgeon("Brent", 113, "Brain");
		Receptionist receptionistOne = new Receptionist("Tyler", 114);
		Janitor JanitorOne = new Janitor("Oscar", 115);
		VampireJanitor vampJanitorOne = new VampireJanitor("Drake", 116);
		
		listEmployees.add(vampJanitorOne);
		listEmployees.add(JanitorOne);
		listEmployees.add(receptionistOne);
		listEmployees.add(brainSurgeon);
		listEmployees.add(doctorOne);
		listEmployees.add(nurseOnDutyOne);
		
		//add default patients for nurse
		Patient ptOne = new Patient("Alex");
		Patient ptTwo = new Patient("Zoey");
		Patient ptThree = new Patient("Jonah");
		Patient ptFour = new Patient("Robert");
		
		nurseOnDutyOne.admitPatient(ptFour);
		nurseOnDutyOne.admitPatient(ptThree);
		nurseOnDutyOne.admitPatient(ptTwo);
		nurseOnDutyOne.admitPatient(ptOne);
		
		
		System.out.println("----------------------------------------");
		System.out.println("    Welcome to High Street Hospital");
		System.out.println("----------------------------------------");
		System.out.println("");
		
		boolean keepLooping = true;
		while (keepLooping) {
		System.out.println("     Main Menu");
		System.out.println("----------------------------------------");
		System.out.println("1. List Current Employees");
		System.out.println("2. List Employee Salaries");
		System.out.println("3. List Employees Able to Draw Blood");
		System.out.println("4. List Employees Able to Care for Patients");
		System.out.println("5. Employee Menu");
		System.out.println("6. Exit");
		System.out.println("----------------------------------------");
		System.out.println("");
		System.out.println("Please enter your selection");
		
		
		String mainMenuChoice = input.nextLine();
		switch (mainMenuChoice) {
		case "1":
			System.out.println(listEmployees.basicEmployeeInfo());
			break;
		case "2":
			System.out.println(listEmployees.getSalaries());
			break;
		case "3":
			
			break;
		case "4":
			
			break;
		case "5":
			
			break;
		case "6":
			
			System.exit(0);
		}
		
		}
		
	}

}
