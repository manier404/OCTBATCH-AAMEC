package citi.session;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\git\\OCTBATCH-AAMEC\\OctProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		a.accept();
				
	}
}
