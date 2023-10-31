package velloremaven;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Apptest {
	// annotations indicates the explicit order between the functions
	//asserts has so many predefined functions are present to test the application code
@Test
	public void logintest1() {
		App obj= new App();
		System.out.println("[TEST CASE 1]: Testing with incorrect username and  wrong password!!");
		boolean result = App.login("Ganesh", "1972");
		Assert.assertEquals(result, false, "Expected FALSE but got TRUE");
	}
	
	public void logintest2() {
		App obj= new App();
		System.out.println("[TEST CASE 2]: Testing with correct username and password!!");
		boolean result = App.login("ram", "3025");
		Assert.assertEquals(result, true, "Expected TRUE but got FALSE");
		
	}
	
}
	
	

