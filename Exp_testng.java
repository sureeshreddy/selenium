package testNG;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_testng {
	@Test // one @Test is equal to one test case / scenario in report
	public void login() {
	System.out.println("login completed");
	}
	@Test
	public void logout() {
	System.out.println("logout completed");
	}
	@Test
	public void addemp() {
	System.out.println("Add new emp");
	}
	@Test
	public void delemp() {
	System.out.println("Delete emp");
	}
	}


