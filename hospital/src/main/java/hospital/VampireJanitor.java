package hospital;

public class VampireJanitor extends Janitor implements DrawBloodInterface {

	public VampireJanitor(String name, int idNum) {
		super(name, idNum);
	}


	@Override
	public void drawBlood(Patient patient) {
		patient.decreaseBlood();
		
	}

	

}
