package hospital;

public abstract class Employee {
	
	private String name;
	private int idNum;
	//private int salary;
	
	public Employee(String name, int idNum) {
		this.name = name;
		this.idNum = idNum;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return idNum;
	}

	public abstract int calculatePay();
	

}
