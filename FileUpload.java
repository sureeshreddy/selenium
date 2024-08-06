package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String args[]) throws Exception{
		//Test Steps
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		    driver.findElement(By.name("Submit")).click();
		    System.out.println("Login completed");
		    Thread.sleep(4000);
		    //click on add btn
		    driver.switchTo().frame("rightMenu");
		    driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.name("txtEmpFirstName")).sendKeys("somala");
		    driver.findElement(By.name("txtEmpLastName")).sendKeys("suresh");
		    Thread.sleep(3000);
		    //File Upload
		    WebElement fileinput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		    fileinput.sendKeys("");
		    Thread.sleep(5000);
		    System.out.println("File uploaded successfully");
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("Logout completed");
driver.close();
	}
	

}
