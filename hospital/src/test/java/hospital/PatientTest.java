package hospital;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatientTest {
	
	@Test 
	public void patientShouldHaveDefaultValues() {
		Patient patient = new Patient( );
		
		//assert that default blood level is set at 20
		assertEquals(20, patient.getBloodLevel());
			
		//assert that health is default at 10
		assertEquals(10, patient.getHealth());
	}
	
}
