package JUnit;

import org.junit.After;
import org.junit.Before;

import management_system.Service;

public class Test {

	@Before
	public void setUp() {
		
	}
	
	@After
	public void teardown() {
		
	}
	
	@org.junit.Test
	public void methodTest() {
		Service newService = new Service();
		newService.addAccount("joel", "jj", "3728");
		newService.addAccount("john", "kool", "3452");
		
		newService.retrieveAccount("joel");
		
		//Assert.assertEquals("joel".)
	}
	
}
