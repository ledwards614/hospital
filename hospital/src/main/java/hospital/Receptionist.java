package hospital;

public class Receptionist extends Employee {
	private int RECEPTIONIST_SALARY = 45000;
	private boolean isOnPhone;

	public Receptionist(String name, int idNum) {
		super(name, idNum);
		isOnPhone = false;
	}

	@Override
	public int calculatePay() {
		return RECEPTIONIST_SALARY;
	}

	public void togglePhone() {
		isOnPhone = !isOnPhone;
	}

	public boolean getIsOnPhone() {
		return isOnPhone;
	}

	@Override
	public String toString() {
		String stats = super.toString() + " " + getIsOnPhone() + "\n";
		return stats;
	}
}
