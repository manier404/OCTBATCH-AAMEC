package citi.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample6 {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\git\\repository01\\sele\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("balakumar531");
		driver.findElement(By.xpath("(//img[@src='/gif/continue_new1.gif?v=1'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='input_password'])[2]")).sendKeys("balakumar531");

}
	

}
