package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import management_system.Service;

public class Test {
	private Service newService = new Service();
	
	@Before
	public void setUp() {
		newService.addAccount("joel", "jj", "3728");
		newService.addAccount("john", "kool", "3452");

		newService.retrieveAccount("joel");
	}
	
	@After
	public void teardown() {
		
	}
	
	@org.junit.Test
	public void methodTest() {
		assertEquals("joel", newService.retrieveAccount("joel").getFirstName());
		assertEquals("3452", newService.retrieveAccount("john").getAccountNumber());
		
	}
	
}
