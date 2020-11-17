package citi.webtabe;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MDAsif {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\WebTable\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
	    w.get("http://demo.guru99.com/test/write-xpath-table.html");
	    w.manage().window().maximize();
	    String title = w.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = w.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    List<WebElement> o = w.findElements(By.tagName("td"));
	    for (WebElement i : o) {
	    	String textTable = i.getText();
	    	System.out.println("Table content:"+textTable);
	    }
	    
	}

}
