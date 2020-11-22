package mani_selenium_9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Citi_Ptactical_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manikandan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
		driver.findElement(By.xpath("//input[@style='margin-right:15px;width: 83px;']")).click();
		
		Alert act_1 = driver.switchTo().alert();
		act_1.accept();
	}

}
