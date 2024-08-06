package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;

public class TC_WindowTable {
	public static void main(String arg[]) {
		//Test steps
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/suras/Downloads/WebTable.html");
		//-- Retrive Count
		int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		int row_col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		System.out.println("Row Count " + row);
		System.out.println("Col Count " + col);
		System.out.println("Row_Col Count " + row_col);
		//---Data : Cell
		String celldata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		System.out.println(celldata);
		//---data : Table

		driver.close();
	}
	
	

}
