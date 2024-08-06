package testNG;

import org.testng.annotations.Test;

public class Testng_Exp {
	@Test // one @Test is equal to one test case / scenario in report
	public void login() {
	System.out.println("login completed");
	}
	@Test
	public void logout() {
	System.out.println("logout completed");
	}
}
