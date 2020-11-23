package web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KV\\workspace\\Web\\driver\\chromedriver.exe");
		// Launch a browser
		WebDriver driver = new ChromeDriver();
		// url address bar url print console title print url
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		// url print console
		driver.manage().window().maximize();
		List<WebElement> tRows = driver.findElements(By.tagName("td"));
	    int size=tRows.size();
	    System.out.println("row of element"+size);
		}
	}

