package hospital;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Patient comes into hospital nurse checks vitals (input) and adds pt 
		
		Nurse nurseOnDuty = new Nurse("Abby", 111);
		Patient ptOne = new Patient("Alex", 20, 40);
		Patient ptTwo = new Patient("Fred", 40, 60);
		nurseOnDuty.admitPatient(ptOne);
		nurseOnDuty.admitPatient(ptTwo);
		
		System.out.println(nurseOnDuty.toString());
		
		
	}

}
