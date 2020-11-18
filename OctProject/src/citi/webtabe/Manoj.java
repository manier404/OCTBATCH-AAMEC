package citi.webtabe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manoj {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();

		List<WebElement> path = driver.findElements(By.tagName("td"));
		for (WebElement i : path) {

			String textTable = i.getText();
			System.out.println("Table content:" + textTable);
		}
	}

}
