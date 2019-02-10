package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeFileSystemTest {
	
	@Test
	public void testGetEmployee() {
		EmployeeFileSystem list = new EmployeeFileSystem();
		Nurse nurse = new Nurse("Jackie", 111);
		Janitor janitor = new Janitor("Mary", 111);
		
		list.add(nurse);
		list.add(janitor);
		
		list.getEmployee("Jackie");
		
		assertEquals("Jackie", list.getEmployee("Jackie").getName());
		
	}
	
}
