package hospital;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class JanitorTest {
	@Test
	public void testJanitorNameId() {
		Janitor janitor = new Janitor("Gary", 767);
		//verify name is Gary
		assertEquals("Gary", janitor.getName());
		//verify id is 767
		assertEquals(767, janitor.getId());
	}
	
	@Test
	public void testSalary() {
		Janitor janitor = new Janitor("Melissa", 555);
		assertEquals(40000, janitor.calculatePay());
	}
	
	@Test
	public void testToggleSweeping() {
		Janitor janitor = new Janitor("Janitor", 2);
		//is on phone should be defaulted as false
		assertEquals(false, janitor.getIsSweeping());
		//toggling phone should change false to true
		janitor.toggleSweeping();
		assertEquals(true, janitor.getIsSweeping());
		//toggling phone again should change is on phone to false
		janitor.toggleSweeping();
		assertEquals(false, janitor.getIsSweeping());
	}
	
	

}
