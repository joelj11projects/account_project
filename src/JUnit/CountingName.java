package JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

import management_system.Service;

public class CountingName {

	private Service newService = new Service();
	
	@Before
	public void setUp() {
		newService.addAccount("joel", "jj", "3728");
		newService.addAccount("john", "kool", "3452");
		newService.addAccount("john", "king", "3466");
		newService.addAccount("liam", "bo", "3452");
	}
	
	@After
	public void teardown() {
		
	}
	
	@org.junit.Test
	public void methodTest() {
		assertEquals(2, newService.countName("john"));
		
	}
}
