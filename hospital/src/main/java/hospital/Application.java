package hospital;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Patient comes into hospital nurse checks vitals (input) and adds pt 
		//this is mostly to test Nurse toString
		Nurse nurseOnDuty = new Nurse("Abby", 111);
		Patient ptOne = new Patient("Alex", 20, 40);
		Patient ptTwo = new Patient("Fred", 40, 60);
		nurseOnDuty.admitPatient(ptOne);
		nurseOnDuty.admitPatient(ptTwo);
		System.out.println(nurseOnDuty.toString());	
		
		//Recptionist toString
		Receptionist receptionistOne = new Receptionist("Sally", 2222);
		System.out.println(receptionistOne.toString());
		
		//Janitor toString
		Employee janitor = new Janitor("Bob", 344);
		System.out.println(janitor.toString());
		
		//Doctor
		Doctor doctor = new Doctor("Billy", 12345, "Nose");
		System.out.println(doctor.toString());
		
		//surgeon
		Surgeon surgeon = new Surgeon("Jillian", 212, "Brain");
		System.out.println(surgeon.toString());
		
	}

}
