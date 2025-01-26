package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@DataProvider(name="userData")
	String[] getUserData() {
		String[] userDetails = {"user1 details", "user2 Details"};
		return userDetails;
		
	}
	
	@Test(dataProvider="userData")
	void testUserData(String user) {
		System.out.println(user);
	}
}
