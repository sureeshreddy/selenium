package webdriverExamples;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_Keyboard_Robotclass {
	public static void main(String args[]) throws Exception{
		//Test Steps
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(4000);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		System.out.println("Login completed");
		Thread.sleep(4000);
		//click- login- keyboard:1.TAB 2.ENTER
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		System.out.println("TAB");
		r.keyPress(KeyEvent.VK_ENTER );
		r.keyRelease(KeyEvent.VK_ENTER );
		Thread.sleep(4000);
		System.out.println("ENTER");
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();
		}

}
