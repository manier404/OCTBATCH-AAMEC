package webtableMano;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> Rows = driver.findElements(By.tagName("tr"));
		for (int i =10; i < Rows.size(); i++) {
			if (i%2==0) {
				WebElement Even = Rows.get(i);
				String text = Even.getText();
				System.out.println(text);
			}
			
		}
	}

}
