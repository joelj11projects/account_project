package account_application;

import java.util.Map;

import json.Json;
import management_system.Account;
import management_system.Service;

public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world to the standard out");
		Service newService = new Service();
		newService.addAccount("joel", "jj", "3728");
		newService.addAccount("john", "kool", "3452");

		newService.retrieveAccount("joel");
		Map<String, Account> jsonList = newService.getAddAndRetrieve();
		Json jsonConvert = new Json();	
		String jConvert = jsonConvert.jsonConverter(jsonList);

		System.out.println(jConvert);
		
		
	}

}