package citi.webtabe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Balakumar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\git\\repository01\\sele\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < row.size(); i++) {
			String text = row.get(i).getText();
		System.out.println(text);
		}
	}

}