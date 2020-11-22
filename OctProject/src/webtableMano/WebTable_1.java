package webtableMano;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> Data = driver.findElements(By.tagName("td"));
		for (WebElement x : Data) {
			String data = x.getText();
			System.out.println("Alldata:"+data);
		}
	}

}
