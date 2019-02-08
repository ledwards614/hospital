package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NurseTest {
	@Test
	public void testNurseName() {
		Employee nurse = new Nurse("Sandy", 111);
		// verify nurse name correct
		assertEquals("Sandy", nurse.getName());
	}

	@Test
	public void testNurseId() {
		Employee nurse = new Nurse("Sandy", 111);
		// verify nurse name correct
		assertEquals(111, nurse.getId());
	}

	@Test
	public void testPay() {
		Employee nurse = new Nurse("Amy", 123);
		assertEquals(50000, nurse.calculatePay());
	}
	@Test
	public void testAddRemovePatients() {
		Nurse nurse = new Nurse("Betty", 222);
		//pt to add
		Patient ptOne = new Patient("Harry", 60, 80);
		nurse.admitPatient(ptOne);
		//verify new size of patient list is now 1
		assertEquals(1, nurse.getLength());
		
		//remove a patient
		nurse.releasePatient("Harry");
		assertEquals(0, nurse.getLength());			
	}
	@Test
	public void testMultipleAddsAndRemoves() {
		Nurse nurse = new Nurse("Betsy", 555);
		Patient ptOne = new Patient("Thelma", 20, 30);
		Patient ptTwo = new Patient("Greta", 60, 80);
		Patient ptThree = new Patient("Wilson", 40, 70);
		//add 3 pts
		nurse.admitPatient(ptOne);
		nurse.admitPatient(ptTwo);
		nurse.admitPatient(ptThree);
		
		//assert 3 patients now on list
		assertEquals(3, nurse.getLength());
		//remove 1 patient and verify only 2 patients exist
		nurse.releasePatient("Greta");
		assertEquals(2, nurse.getLength());
		
	}
	@Test
	public void testCareForPt() {
		Nurse nurse = new Nurse("Olivia", 225);
		Patient ptOne = new Patient("Henry", 60, 20);
		nurse.admitPatient(ptOne);
		//caring for pt should increase health by 10
		nurse.careForPt("Henry");
		assertEquals(30, nurse.getPatient("Henry").getCurrentHealth());
		
		
	}
	
}
