package project.WindowHandling;
//Search hand sanitizer and click any hand sanitizer add it to cart
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\OCTBATCH-AAMEC\\OctProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.snapdeal.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    WebElement searchBox = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
	    searchBox.sendKeys("Hand Sanitizer");
	    WebElement searchButton = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	    searchButton.click();
        Thread.sleep(3000);
	    WebElement productClick = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
	    productClick.click();
	    
	    String parentwindowHandle = driver.getWindowHandle();
        System.out.println("parent window Address: "+parentwindowHandle);
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String currentWindow : allWindowHandles) {
        	if(!parentwindowHandle.equals(currentWindow))
        	driver.switchTo().window(currentWindow);
        	}
        
        WebElement cartButton = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
        cartButton.click();

	}

}
