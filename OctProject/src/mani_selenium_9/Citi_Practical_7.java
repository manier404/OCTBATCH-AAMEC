package mani_selenium_9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Citi_Practical_7 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Manikandan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	driver.switchTo().frame(0);
	driver.findElement(By.name("fldLoginUserId")).sendKeys("Mani");

	driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
	driver.findElement(By.name("fldPassword")).sendKeys("12345");

	
}
}
