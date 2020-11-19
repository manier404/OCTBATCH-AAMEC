package citi.webtabe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\git\\manish\\Java\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		 driver.manage().window().maximize();
		    String title = driver.getTitle();
		    System.out.println("Title of the page: "+title);
		    String currentUrl = driver.getCurrentUrl();
		    System.out.println("CurrentUrl: "+currentUrl);
		    List<WebElement> o = driver.findElements(By.tagName("td"));
		    for (WebElement i : o) {
		    	String textTable = i.getText();
		    	System.out.println("Table content:"+textTable);
		    }
		    
		}
		}
