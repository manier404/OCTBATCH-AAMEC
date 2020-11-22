package project.WindowHandling;
//Search iphones 7 and click 1st phone add it to cart.print the you pay cost displayed.
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

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
	    searchBox.sendKeys("Iphone 7");
	    WebElement searchButton = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	    searchButton.click();
        Thread.sleep(2000);
	    WebElement productClick = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
	    productClick.click();
	    
	    String parentwindowHandle = driver.getWindowHandle();
        System.out.println("parent window Address: "+parentwindowHandle);
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String currentWindow : allWindowHandles) {
        	if(!parentwindowHandle.equals(currentWindow))
        	driver.switchTo().window(currentWindow);
        	}
        WebElement itemName = driver.findElement(By.xpath("//h1[@class='pdp-e-i-head']"));
        String textOfName = itemName.getText();

        WebElement cartButton = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
        cartButton.click();
        Thread.sleep(2000);
        WebElement priceText = driver.findElement(By.xpath("//span[@class='price']"));
        String textOfPrice = priceText.getText();
        System.out.println("Price of "+textOfName+" is "+textOfPrice);

        }
}
