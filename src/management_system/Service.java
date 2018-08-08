package management_system;

import java.util.HashMap;

public class Service {
	
	HashMap<String, Account> addAndRetrieve;
	
	public Service() {
		addAndRetrieve = new HashMap <>();
	}
	
	public void addAccount(String firstName, String lastName, String accountNumber) {
		Account newAccount = new Account(firstName, lastName, accountNumber);
		addAndRetrieve.put(firstName, newAccount);
	}
	
	public void retrieveAccount(String firstName) {
		 addAndRetrieve.get(firstName);
		 System.out.println(addAndRetrieve.get(firstName));
		 System.out.println(addAndRetrieve.get(firstName).getDetails());
	}
	
	
}
