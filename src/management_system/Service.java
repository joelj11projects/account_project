package management_system;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	public HashMap<String, Account> addAndRetrieve;
	
	public Service() {
		addAndRetrieve = new HashMap <>();
		
		
	}
	
	public void addAccount(String firstName, String lastName, String accountNumber) {
		Account newAccount = new Account(firstName, lastName, accountNumber);
		addAndRetrieve.put(firstName, newAccount);
	}
	
	public Account retrieveAccount(String firstName) {
		 return addAndRetrieve.get(firstName);

	}

	public HashMap<String, Account> getAddAndRetrieve() {
		return addAndRetrieve;
	}

	public void setAddAndRetrieve(HashMap<String, Account> addAndRetrieve) {
		this.addAndRetrieve = addAndRetrieve;
	}


	
	
}
