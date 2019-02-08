package hospital;

import static org.junit.Assert.assertEquals;

import javax.print.Doc;

import org.junit.Test;

public class DoctorTest {
	@Test
	public void testDoctorNameId() {
		Doctor doc = new Doctor("Ida", 4455);
		assertEquals("Ida", doc.getName());
		assertEquals(4455, doc.getId());	
	}
	
	@Test
	public void testSalary() {
		Doctor doc = new Doctor("Emily", 11111);
		assertEquals(90000, doc.calculatePay());
	}
	
	@Test 
	public void testSpeciality() {
		Doctor doc = new Doctor("Grant", 333, "General");
		assertEquals("General", doc.getSpecialty());	
	}
	
	

}
