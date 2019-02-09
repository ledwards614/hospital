package hospital;

import static org.junit.Assert.assertEquals;
import org.junit.Test; 

public class VampireJanitorTest {
	
	@Test
	public void testNameIdSalarySweeping() {
		VampireJanitor vamp = new VampireJanitor("Drake", 4444);
		
		//is it necessary to test methods inherited from superclasses?
	}

	@Test
	public void testDrawBlood() {
		VampireJanitor vamp = new VampireJanitor("Drake", 4444);
		Patient ptOne = new Patient("Henry");
		vamp.drawBlood(ptOne);
		//blood should reduce to zero
		assertEquals(0, ptOne.getCurrentBlood());
		
		
	}
}
