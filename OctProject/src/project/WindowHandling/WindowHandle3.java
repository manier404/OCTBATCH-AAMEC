package project.WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\OCTBATCH-AAMEC\\OctProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.homedepot.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    WebElement searchBox = driver.findElement(By.xpath("//input[@id='headerSearch']"));
	    searchBox.sendKeys("ceiling fans");
	    WebElement searchButton = driver.findElement(By.xpath("//button[@id='headerSearchButton']"));
	    searchButton.click();
	    Thread.sleep(5000);
	    WebElement productClick = driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]"));
	    productClick.click();
	    Thread.sleep(5000);
	    
	    String parentWindowHandle = driver.getWindowHandle();
	    System.out.println("Address of parent Window is: "+parentWindowHandle);
	    Set<String> allwindowHandles = driver.getWindowHandles();
	    for (String currentwindowHandle : allwindowHandles) {
	    	if(!parentWindowHandle.equals(currentwindowHandle)) {
	    		driver.switchTo().window(currentwindowHandle);
	    	}
	    		
		}

	    WebElement productName = driver.findElement(By.xpath("//h1[@class='product-details__title']"));
	    String textofProduct = productName.getText();
	    System.out.println("Product Name: "+textofProduct);

	    }

}
