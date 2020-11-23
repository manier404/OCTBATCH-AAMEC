package project.WindowHandling;
//Search mask and click any mask Enter delivery pincode
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle6 {

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
	    searchBox.sendKeys("Mask");
	    WebElement searchButton = driver.findElement(By.className("L0Z3Pu"));
	    searchButton.click();
	    Thread.sleep(2000);
	    WebElement productClick = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
	    productClick.click();
	    
	    Set<String> allwindowHandles = driver.getWindowHandles();
	    String parentwindowHandle = driver.getWindowHandle();
	    for (String currentWindowHandle : allwindowHandles) {
	    	if (parentwindowHandle!=currentWindowHandle) {
	    		driver.switchTo().window(currentWindowHandle);
	    		System.out.println("Address of ParentWindow: "+parentwindowHandle);
	    	    System.out.println("Address of Current Window: "+currentWindowHandle);
	    		}
		}
	    
	    //enter pincode
	    WebElement pincodeBox = driver.findElement(By.xpath("//input[@id='pincodeInputId']"));
	    pincodeBox.sendKeys("600001");

	}

}
