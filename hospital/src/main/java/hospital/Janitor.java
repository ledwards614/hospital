package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Janitor extends Employee {
	
	private int JANITOR_SALARY = 40000;
	private boolean isSweeping;
	
	public Janitor(String name, int idNum) {
		super(name, idNum);
		isSweeping = false;
	}

	@Override
	public int calculatePay() {
		return JANITOR_SALARY;
	}
	public void toggleSweeping() {
		isSweeping = !isSweeping;	
	}
	public boolean getIsSweeping() {
		return isSweeping;
	}
	@Override
	public String toString() {
		String stats = "Janitor: " + getName() + " " + getId() + " " + getIsSweeping();
		return stats;
	}
	
}
