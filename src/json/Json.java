package json;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import management_system.Account;

public class Json {

	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	public String jsonConverter(Map<Integer, Account> jsonList) {
		
		return gson.toJson(jsonList);
	}
		
	
}
