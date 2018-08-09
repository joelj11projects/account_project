package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import management_system.Service;

public class CountingName {

	private Service newService;
	
	@Before
	public void setUp() {
		newService = new Service();
		newService.addAccount("joel", "jj", "3728");
		newService.addAccount("john", "kool", "3452");
		newService.addAccount("john", "king", "3466");
		newService.addAccount("liam", "bo", "3452");
		newService.addAccount("john", "king", "9726");
	}
	
	@After
	public void teardown() {
		
	}
	
	@Test
	public void methodTest() {
		assertEquals(3, newService.countName("john"));
		
		
		
	}
}
