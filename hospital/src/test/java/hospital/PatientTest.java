package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatientTest {

	@Test
	public void testDefaultPatient() {
		Patient p = new Patient("Eliza");
		assertEquals(20, p.getCurrentBlood());
		assertEquals(10, p.getCurrentHealth());
	}

	@Test
	public void testPatientName() {
		Patient pt = new Patient("Meredith", 40, 60);
		assertEquals("Meredith", pt.getName());

	}

	@Test
	public void testPatientVitals() {
		Patient pt = new Patient("Marvin", 40, 60);
		assertEquals(40, pt.getCurrentBlood());
		assertEquals(60, pt.getCurrentHealth());

	}

	@Test
	public void testDecreaseBlood() {
		Patient pt = new Patient("Marvin", 40, 60);
		pt.decreaseBlood();
		assertEquals(20, pt.getCurrentBlood());

	}

	@Test
	public void testIncreaseHealth() {
		Patient pt = new Patient("Marvin", 40, 60);
		pt.increaseHealth();
		assertEquals(70, pt.getCurrentHealth());
	}

	@Test
	public void testTickHealth() {
		Patient pt = new Patient("Marvin", 40, 60);
		pt.tick();
		assertEquals(59, pt.getCurrentHealth());
	}
}
