package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select; 

public class TC_DROPDOWN {
	public static void main(String arg[])throws Exception{
		//Test Steps
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("login completed");
		Thread.sleep(4000);
		//enter into frame
		driver.switchTo().frame("rightMenu");
		System.out.println("enetred into frame");
		Select st = new Select(driver.findElement(By.name("loc_code")));
		//st.selectByVisibleText("Emp.ID");
		//st.selectByValue(1);
		st.selectByValue("0");
		System.out.println("dropdown option is selected");
		Thread.sleep(4000);
		driver.findElement(By.name("loc_code")).sendKeys("0545");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Search']")).click ();
		Thread.sleep(4000);
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click ();
		System.out.println("deleted succesfully");
		Thread.sleep(4000);
		//exist frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
