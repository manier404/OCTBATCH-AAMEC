package mani_WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CitiWebHandling_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manikandan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		driver.get("https://www.flipkart.com/ ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mask");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[1]")).click();
		String parentUrl = driver.getWindowHandle();
		Set<String> currentUrl = driver.getWindowHandles();
		for (String x : currentUrl) {
			if (!x.equals(parentUrl)) {
				driver.switchTo().window(x);
				
			}
		}
		driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("600002");
		
	}

}
