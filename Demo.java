package webdriverExamples;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Demo {
	public static void main(String arg[]) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		driver.findElement(By.name("username")).sendKeys("ram_multivers");
		driver.findElement(By.name("password")).sendKeys("Monocef@200");
		driver.findElement(By.linkText("<div class=\\x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1\"><button class=\" _acan _acap _acas _aj1- _ap30\" disabled=\"\" type=\"submit\"><div class=\"x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1\">Log in</div></button></div>")).click();
		System.out.println("Login completed");
	}

}
