package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSurgeon {
	
	@Test
	public void testSurgeonNameId() {
		Surgeon surg = new Surgeon("Ida", 4455, "Brain");
		assertEquals("Ida", surg.getName());
		assertEquals(4455, surg.getId());	
	}
	
	@Test
	public void testSalary() {
		Surgeon surgeon = new Surgeon("Emily", 11111, "Spine");
		assertEquals(120000, surgeon.calculatePay());
	}
	
	@Test 
	public void testSpeciality() {
		Surgeon surgeon = new Surgeon("Grant", 333, "Internal");
		assertEquals("Internal", surgeon.getSpecialty());	
	}
	
	@Test
	public void testIsOperating() {
		Surgeon surgeon = new Surgeon("Vera", 222222, "Feet");
		//toggle is operating should default to false
		assertEquals(false, surgeon.getIsOperating());
		//toggle should change is operating to true
		surgeon.toggleIsOperating();
		assertEquals(true, surgeon.getIsOperating());
		
	}
	
	

}
