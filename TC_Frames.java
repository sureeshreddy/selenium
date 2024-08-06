package webdriverExamples;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_Frames {
public static void main(String args[]) throws Exception{
	//Test Step
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	System.out.println("Login completed");
	//Enter into frame
	driver.switchTo().frame("rightMenu");
	//Click on Add button
	driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("somala");
	driver.findElement(By.name("txtEmpLastName")).sendKeys("suresh");
	Thread.sleep(3000);
	driver.findElement(By.id("btnEdit")).click();
	Thread.sleep(3000);
	System.out.println("New emp added");
	//Exit from frame
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
	
}
}
