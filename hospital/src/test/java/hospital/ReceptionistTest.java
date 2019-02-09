package hospital;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReceptionistTest {
	
	@Test
	public void testRecptionistNameAndId() {
		Receptionist recpt = new Receptionist("Andrea", 343);
		assertEquals("Andrea", recpt.getName());
		assertEquals(343, recpt.getId());	
	}
	
	@Test
	public void testTogglePhone() {
		Receptionist recpt = new Receptionist("Andrea", 343);
		//is on phone should be defaulted as false
		assertEquals(false, recpt.getIsOnPhone());
		//toggling phone should change false to true
		recpt.togglePhone();
		assertEquals(true, recpt.getIsOnPhone());
		//toggling phone again should change is on phone to false
		recpt.togglePhone();
		assertEquals(false, recpt.getIsOnPhone());
	}
	
	@Test
	public void testSalary() {
		Receptionist recpt = new Receptionist("Jordan", 888);
		assertEquals(45000, recpt.calculatePay());
	}

}
