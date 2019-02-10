package hospital;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Create List of Employees
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

		// add default patients for nurse
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
			System.out.println("6. Search for Employee");
			System.out.println("7. Hire Employee");
			System.out.println("8. Fire Employee");
			System.out.println("9. Exit");
			System.out.println("----------------------------------------");
			System.out.println("");
			System.out.println("Please enter your selection");

			String mainMenuChoice = input.nextLine();
			switch (mainMenuChoice) {
			case "1":
				System.out.println(listEmployees.basicEmployeeInfo());
				System.out.println("");
				System.out.println("Press any key to continue");
				input.nextLine();
				break;
			case "2":
				System.out.println(listEmployees.getSalaries());
				System.out.println("");
				System.out.println("Press any key to continue");
				input.nextLine();
				break;
			case "3":
				System.out.println(listEmployees.canDrawBlood());
				System.out.println("");
				System.out.println("Press any key to continue");
				input.nextLine();
				break;
			case "4":
				System.out.println(listEmployees.canCareForPatients());
				System.out.println("");
				System.out.println("Press any key to continue");
				input.nextLine();
				break;
			case "5":
				boolean loopEmpMenu = true;
				while (loopEmpMenu) {
					System.out.println("     Employee Menu");
					System.out.println("----------------------------------------");
					System.out.println("1. Nurse");
					System.out.println("2. Doctor");
					System.out.println("3. Surgeon");
					System.out.println("4. Receptionist");
					System.out.println("5. Janitor");
					System.out.println("6. Vampire Janitor");
					System.out.println("7. Exit to Main Menu");
					System.out.println("----------------------------------------");
					System.out.println("");
					System.out.println("Please enter your selection");

					String empMenuChoice = input.nextLine();
					switch (empMenuChoice) {
					case "1":
						nurseMenu(input, listEmployees);
						break;

					case "2":
						doctorMenu(input, listEmployees);
						break;

					case "3":
						surgeonMenu(input, listEmployees);

						break;
					case "4":
						receptionistMenu(input, listEmployees);

						break;
					case "5":
						janitorMenu(input, listEmployees);

						break;
					case "6":
						vampireJanitorMenu(input, listEmployees);
						break;
					case "7":
						loopEmpMenu = false;
					}
				}

				break;
			case "6":
				System.out.println("Please enter employee's name");
				System.out.println(listEmployees.getEmployee(input.nextLine()).toString());
				System.out.println("");
				System.out.println("Press any key to continue");
				input.nextLine();
				break;
			case "7":
				// hire
				System.out.println("Please enter new hire's name");
				String newHireName = input.nextLine();
				System.out.println("Please enter in new hire's ID number");
				int newHireId = input.nextInt();
				input.nextLine();
				System.out.println("What is the new hire's job title?");
				System.out.println("Nurse, Doctor, Surgeon, Receptionist, Janitor, Vampire Janitor");
				String jobTitle = input.nextLine();

				if (jobTitle.equalsIgnoreCase("nurse")) {
					listEmployees.add(new Nurse(newHireName, newHireId));
				}
				if (jobTitle.equalsIgnoreCase("doctor")) {
					System.out.println("What is the Doctor's speciality?");
					String specialty = input.nextLine();
					listEmployees.add(new Doctor(newHireName, newHireId, specialty));
				}
				if (jobTitle.equalsIgnoreCase("surgeon")) {
					System.out.println("What is the Surgeon's speciality?");
					String specialty = input.nextLine();
					listEmployees.add(new Surgeon(newHireName, newHireId, specialty));
				}
				if (jobTitle.equalsIgnoreCase("receptionist")) {
					listEmployees.add(new Receptionist(newHireName, newHireId));
				}
				if (jobTitle.equalsIgnoreCase("janitor")) {
					listEmployees.add(new Janitor(newHireName, newHireId));
				}
				if (jobTitle.equalsIgnoreCase("vampire janitor")) {
					listEmployees.add(new VampireJanitor(newHireName, newHireId));
				}

				break;
			case "8":
				// fire
				System.out.println("Please enter employee's name that you wish to terminate employment");
				String name = input.nextLine();
				listEmployees.remove(name);
				System.out.println(name + " is no longer employed at High Street Hospital");
				break;
			case "9":

				System.exit(0);
			}

		}

	}

	private static void vampireJanitorMenu(Scanner input, EmployeeFileSystem listEmployees) {
		// vampire janitor
		System.out.println("Please Enter Vampire Janitor's Name");
		System.out.println(listEmployees.listEmployeesByJob("Vampire"));
		VampireJanitor vampSelection = (VampireJanitor) listEmployees.getEmployee(input.nextLine());

		boolean loopVamp = true;
		while (loopVamp) {
			System.out.println("     Vampire Janitor Menu");
			System.out.println("----------------------------------------");
			System.out.println("1. Start Sweeping Floor");
			System.out.println("2. Finish Sweeping Floor");
			System.out.println("3. Feed");
			System.out.println("4. Exit to Employee Menu");
			System.out.println("----------------------------------------");
			System.out.println("");
			System.out.println("Please enter your selection");

			String janitorMenuChoice = input.nextLine();
			switch (janitorMenuChoice) {
			case "1":
				System.out.println("** Floor is dirty **");
				System.out.println("** sweeping **");
				vampSelection.toggleSweeping();
				System.out.println("Vampire Janitor is sweeping = " + vampSelection.getIsSweeping());
				break;

			case "2":
				System.out.println("** Floor has been cleaned **");
				vampSelection.toggleSweeping();
				System.out.println("Janitor is sweeping = " + vampSelection.getIsSweeping());

				break;
			case "3":
				System.out.println("Enter the patient you would like to feed on?");
				Patient ptBlood = new Patient(input.nextLine());
				vampSelection.drawBlood(ptBlood);
				String pBlood = ptBlood.getName() + "'s blood level is " + ptBlood.getCurrentBlood() + "\n";
				System.out.println(pBlood);

				// feeding on patient decreases health by 5
				ptBlood.tick();
				ptBlood.tick();
				ptBlood.tick();
				ptBlood.tick();
				ptBlood.tick();
				break;
			case "4":
				loopVamp = false;

			}
		}
	}

	private static void janitorMenu(Scanner input, EmployeeFileSystem listEmployees) {
		// Janitor
		System.out.println("Please Enter Janitor's Name");
		System.out.println(listEmployees.listEmployeesByJob("janitor"));
		Janitor janitorSelection = (Janitor) listEmployees.getEmployee(input.nextLine());

		boolean loopJanitor = true;
		while (loopJanitor) {
			System.out.println("     Janitor Menu");
			System.out.println("----------------------------------------");
			System.out.println("1. Start Sweeping Floor");
			System.out.println("2. Finish Sweeping Floor");
			System.out.println("3. Exit to Employee Menu");
			System.out.println("----------------------------------------");
			System.out.println("");
			System.out.println("Please enter your selection");

			String janitorMenuChoice = input.nextLine();
			switch (janitorMenuChoice) {
			case "1":
				System.out.println("** Floor is dirty **");
				System.out.println("** sweeping **");
				janitorSelection.toggleSweeping();
				System.out.println("Janitor is sweeping = " + janitorSelection.getIsSweeping());
				break;

			case "2":
				System.out.println("** Floor has been cleaned **");
				janitorSelection.toggleSweeping();
				System.out.println("Janitor is sweeping = " + janitorSelection.getIsSweeping());

				break;
			case "3":
				loopJanitor = false;
			}
		}
	}

	private static void receptionistMenu(Scanner input, EmployeeFileSystem listEmployees) {
		// Receptionist
		System.out.println("Please Enter Receptionist's Name");

		System.out.println(listEmployees.listEmployeesByJob("receptionist"));
		Receptionist recptSelection = (Receptionist) listEmployees.getEmployee(input.nextLine());

		boolean loopReception = true;
		while (loopReception) {
			System.out.println("     Receptionist Menu");
			System.out.println("----------------------------------------");
			System.out.println("1. Answer Phone");
			System.out.println("2. Hang up Phone");
			System.out.println("3. Exit to Employee Menu");
			System.out.println("----------------------------------------");
			System.out.println("");
			System.out.println("Please enter your selection");

			String recptionistMenuChoice = input.nextLine();
			switch (recptionistMenuChoice) {
			case "1":
				System.out.println("** Ring Ring **");
				recptSelection.togglePhone();
				System.out.println("Receptionist is on the phone = " + recptSelection.getIsOnPhone());
				break;

			case "2":
				System.out.println("** Click **");
				System.out.println("Call has ended");
				recptSelection.togglePhone();
				System.out.println("Receptionist is on the phone = " + recptSelection.getIsOnPhone());

				break;

			case "3":
				loopReception = false;
			}
		}
	}

	private static void surgeonMenu(Scanner input, EmployeeFileSystem listEmployees) {
		// Surgeon
		System.out.println("Please Enter Surgeon's Name");
		System.out.println(listEmployees.listEmployeesByJob("surgeon"));
		Surgeon surgeonSelection = (Surgeon) listEmployees.getEmployee(input.nextLine());

		boolean loopSurgeon = true;
		while (loopSurgeon) {
			System.out.println("     Surgeon Menu");
			System.out.println("----------------------------------------");
			System.out.println("1. Care for Patient");
			System.out.println("2. Draw Blood");
			System.out.println("3. Begin Surgery");
			System.out.println("4. End Surgery");
			System.out.println("5. Exit to Employee Menu");
			System.out.println("----------------------------------------");
			System.out.println("");
			System.out.println("Please enter your selection");

			String surgeonMenuChoice = input.nextLine();
			switch (surgeonMenuChoice) {
			case "1":
				System.out.println("Enter the patient name you would like to care for?");
				Patient ptForSurgeon = new Patient(input.nextLine());
				surgeonSelection.careForPt(ptForSurgeon);
				// input.nextLine();
				String ptHealth = ptForSurgeon.getName() + "'s health is " + ptForSurgeon.getCurrentHealth() + "\n";
				System.out.println(ptHealth);
				break;

			case "2":
				System.out.println("Enter the patient name you would like to draw blood from?");
				Patient ptForDrawBlood = new Patient(input.nextLine());
				surgeonSelection.drawBlood(ptForDrawBlood);
				// input.nextLine();
				String pBlood = ptForDrawBlood.getName() + "'s blood level is " + ptForDrawBlood.getCurrentBlood()
						+ "\n";
				System.out.println(pBlood);

				// drawing blood decreases health
				ptForDrawBlood.tick();

				break;
			case "3":
				// begin surgery
				System.out.println("** preparing to begin surgery **");
				surgeonSelection.toggleIsOperating();
				System.out.println("Surgeon is operating = " + surgeonSelection.getIsOperating());
				break;
			case "4":
				// end surgery
				System.out.println("** surgery was a success! **");
				surgeonSelection.toggleIsOperating();
				System.out.println("Surgeon is operating = " + surgeonSelection.getIsOperating());
				break;

			case "5":
				loopSurgeon = false;
			}
		}
	}

	private static void doctorMenu(Scanner input, EmployeeFileSystem listEmployees) {
		System.out.println("Please Enter Doctor's Name");
		System.out.println(listEmployees.listEmployeesByJob("doctor"));
		Doctor doctorSelection = (Doctor) listEmployees.getEmployee(input.nextLine());

		boolean loopDr = true;
		while (loopDr) {
			System.out.println("     Doctor Menu");
			System.out.println("----------------------------------------");
			System.out.println("1. Care for Patient");
			System.out.println("2. Draw Blood");
			System.out.println("3. Exit to Employee Menu");
			System.out.println("----------------------------------------");
			System.out.println("");
			System.out.println("Please enter your selection");

			String doctorMenuChoice = input.nextLine();
			switch (doctorMenuChoice) {
			case "1":
				System.out.println("Enter the patient name you would like to care for?");
				Patient ptForDr = new Patient(input.nextLine());
				doctorSelection.careForPt(ptForDr);
				// input.nextLine();
				String ptHealth = ptForDr.getName() + "'s health is " + ptForDr.getCurrentHealth() + "\n";
				System.out.println(ptHealth);
				break;

			case "2":
				System.out.println("Enter the patient name you would like to draw blood from?");
				Patient ptForDrawBlood = new Patient(input.nextLine());
				doctorSelection.drawBlood(ptForDrawBlood);
				String pBlood = ptForDrawBlood.getName() + "'s blood level is " + ptForDrawBlood.getCurrentBlood()
						+ "\n";
				System.out.println(pBlood);

				// drawing blood decreases health
				ptForDrawBlood.tick();

				break;
			case "3":
				loopDr = false;
			}
		}
	}

	private static void nurseMenu(Scanner input, EmployeeFileSystem listEmployees) {
		System.out.println("Please Enter Nurse's Name");
		System.out.println(listEmployees.listEmployeesByJob("nurse"));

		Nurse nurseSelection = (Nurse) listEmployees.getEmployee(input.nextLine());
		// if (nurseSelection instanceof Nurse) {

		boolean loopNurse = true;
		while (loopNurse) {
			System.out.println("     Nurse Menu");
			System.out.println("----------------------------------------");
			System.out.println("1. List all patients");
			System.out.println("2. Care for All Patients");
			System.out.println("3. Care for Single Patient");
			System.out.println("4. Draw Blood");
			System.out.println("5. Admit Patient");
			System.out.println("6. Release Patient");
			System.out.println("7. Exit to Employee Menu");
			System.out.println("----------------------------------------");
			System.out.println("");
			System.out.println("Please enter your selection");

			// Patient health will decrease every loop if nurse doesn't attend to patients
			// needs
			nurseSelection.tickAll();

			String nurseMenuChoice = input.nextLine();
			switch (nurseMenuChoice) {
			case "1":
				// list all patients
				System.out.println(nurseSelection.listPatients());

				break;
			case "2":
				// care for all patients
				nurseSelection.careForAllPatients();

				break;
			case "3":
				System.out.println("Which patient would you like to care for?");
				System.out.println(nurseSelection.listPatients());
				Patient patientToCareFor = nurseSelection.getPatient(input.nextLine());
				nurseSelection.careForPt(patientToCareFor);
				// input.nextLine();
				String ptHealth = patientToCareFor.getName() + "'s health is " + patientToCareFor.getCurrentHealth()
						+ "\n";
				System.out.println(ptHealth);

				break;
			case "4":
				// draw blood
				System.out.println("Which patient would you like to draw blood from?");
				System.out.println(nurseSelection.listPatients());
				Patient patientToDrawBlood = nurseSelection.getPatient(input.nextLine());
				nurseSelection.careForPt(patientToDrawBlood);
				// input.nextLine();
				String ptBlood = patientToDrawBlood.getName() + "'s blood level is "
						+ patientToDrawBlood.getCurrentBlood() + "\n";
				System.out.println(ptBlood);
				// drawing blood decreases health
				patientToDrawBlood.tick();
				break;
			case "5":
				// admit patient ----- not required do last
				break;
			case "6":
				// release patient -----not required do last
				break;
			case "7":

				loopNurse = false;

			}

		}
	}
}
