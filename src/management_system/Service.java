package management_system;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	public HashMap<Integer, Account> addAndRetrieve;
	
	private int counter =0;
	private int countNames = 0;
	public Service() {
		addAndRetrieve = new HashMap <>();
		
	}
	
	public void addAccount(String firstName, String lastName, String accountNumber) {
		Account newAccount = new Account(firstName, lastName, accountNumber);
		addAndRetrieve.put(counter, newAccount);
		counter++;
	}
	
	
	public Account retrieveAccount(String key) {
		 return addAndRetrieve.get(key);

	}

	public HashMap<Integer, Account> getAddAndRetrieve() {
		return addAndRetrieve;
	}

	public void setAddAndRetrieve(HashMap<Integer, Account> addAndRetrieve) {
		this.addAndRetrieve = addAndRetrieve;
	}

	public int countName(String givenName) {
		
		
		for(int i=0; i< addAndRetrieve.size() ;i++) {
		
			String gName = addAndRetrieve.get(i).getFirstName();
			
		if (gName.equals(givenName) ) {
				
				//System.out.println(retrieveAccount(givenName));
				countNames++;
			}
		} 
		return countNames;
	}
	
}
