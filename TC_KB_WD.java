package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class TC_KB_WD {
	public static void main(String args[])throws Exception{
		//Test Steps
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		System.out.println("Application opend");
		driver.findElement(By.name("q")).sendKeys("instagram");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.close();
	}

}
