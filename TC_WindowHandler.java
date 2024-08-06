package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.ArrayList;
import org.openqa.selenium.By;


public class TC_WindowHandler {
	public static void main(String arg[])throws Exception {
		//Test Steps
		WebDriver driver = new EdgeDriver();
		//1st wind
		driver.get("file:///C:/Users/suras/Downloads/multiplewindows.html");
		Thread.sleep(3000);
		//2nd wind
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		//3rd wind
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		ArrayList<String> mwind = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(mwind.get(0));
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
		
		
		
	}

}
