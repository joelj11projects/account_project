package management_system;

public class Main {

	public static void main(String[] args) {
		Service newService = new Service();
		newService.addAccount("joel", "jj", "3728");
		newService.addAccount("john", "kool", "3452");
		
		newService.retrieveAccount("joel");
	}
	
}
