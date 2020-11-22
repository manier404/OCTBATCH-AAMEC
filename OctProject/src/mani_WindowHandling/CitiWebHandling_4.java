package mani_WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CitiWebHandling_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manikandan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		driver.get("https://www.snapdeal.com/ ");
		driver.findElement(By.name("keyword")).sendKeys("Hand sanitizer");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='col-xs-6  favDp product-tuple-listing js-tuple '])[1]")).click();
		String parentUrl = driver.getWindowHandle();
		Set<String> currentUrl = driver.getWindowHandles();
		for (String x : currentUrl) {
			if (!x.equals(parentUrl)) {
				driver.switchTo().window(x);
				
			}
		}
		WebElement price = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		String text = price.getText();
		System.out.println("The cost is "+text+" Rs");
	}

}
