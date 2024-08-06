package webdriverExamples;
//to access web driver classes & methods
import org.openqa.selenium.WebDriver;


//to access browser

import org.openqa.selenium.chrome.ChromeDriver;
//to access object/element methods
import org.openqa.selenium.By;


public class TC001 {
	public static void main(String args[]) throws Exception {
		//Test steps
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application opened");
		Thread.sleep(3000);//wait stmt
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout completed");
		
		driver.close();
	}

}
