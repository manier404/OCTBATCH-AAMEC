package project.WindowHandling;
//Search redmi phone and click any phone print price amount
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\OCTBATCH-AAMEC\\OctProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/ ");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    
	    WebElement loginClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	    loginClose.click();
	    
	    WebElement searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys("Redmi Phones");
	    WebElement searchButton = driver.findElement(By.className("L0Z3Pu"));
	    searchButton.click();
	    Thread.sleep(2000);
	    WebElement productClick = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]"));
	    productClick.click();
	    
	    Set<String> allwindowHandles = driver.getWindowHandles();
	    String parentwindowHandle = driver.getWindowHandle();
	    for (String currentWindowHandle : allwindowHandles) {
	    	if (parentwindowHandle!=currentWindowHandle) {
	    		driver.switchTo().window(currentWindowHandle);
	    		}
		}
	    
	    WebElement priceOfProduct = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
	    String textOfPrice = priceOfProduct.getText();
	    WebElement productName = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
        String textOfProduct = productName.getText();
        System.out.println("price of "+textOfProduct+ " is "+textOfPrice);
	    }

}
