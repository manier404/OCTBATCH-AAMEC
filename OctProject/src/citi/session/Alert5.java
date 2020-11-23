package citi.session;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaviya Sri\\Desktop\\OCTBATCH\\OctProject\\Driver\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='submit'])")).click();
		Thread.sleep(5000);
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
	}

}
