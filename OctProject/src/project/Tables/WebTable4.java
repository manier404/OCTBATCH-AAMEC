package project.Tables;
//Print all the details in 2nd webtable

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\java class\\MyRepository\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.w3schools.com/html/html_tables.asp");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    List<WebElement> tableElements = driver.findElements(By.tagName("tr"));
	    for (int i = 10; i < tableElements.size(); i++) {
	    	WebElement Element = tableElements.get(i);
	    	String textOfElements = Element.getText();
	    	System.out.println("\n"+textOfElements);
	    
			}
    	

	    
	    
	    
	}
	    
}
