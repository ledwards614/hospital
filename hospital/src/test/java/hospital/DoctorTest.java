package hospital;

import static org.junit.Assert.assertEquals;

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

	@Test
	public void testCareForPt() {
		Doctor dr = new Doctor("Olivia", 225, "Hands");
		Patient ptOne = new Patient("Henry");
		dr.careForPt(ptOne);
		// caring for pt should increase health by 10 (default set at 10, increase to
		// 20)
		assertEquals(20, ptOne.getCurrentHealth());
	}

	@Test
	public void testDrawBlood() {
		Doctor dr = new Doctor("Olivia", 225, "Hands");
		Patient ptOne = new Patient("Henry");
		dr.drawBlood(ptOne);
		// default blood is 20, drawing blood reduces by 20, new blood level should be
		// zero
		assertEquals(0, ptOne.getCurrentBlood());
	}
}
