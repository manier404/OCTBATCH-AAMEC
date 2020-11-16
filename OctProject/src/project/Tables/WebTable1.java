package project.Tables;
//Print all the content in the dynamic webtable
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\WebTable\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    List<WebElement> bodyPath = driver.findElements(By.tagName("td"));
	    for (WebElement i : bodyPath) {
	    	String textTable = i.getText();
	    	System.out.println("Table content:"+textTable);
	    }
	    
	    

	}

}
