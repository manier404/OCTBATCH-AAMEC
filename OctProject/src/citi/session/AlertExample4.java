package citi.session;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample4 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\git\\repository01\\sele\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//img[@src='/gif/continue_new1.gif?v=1'])[1]")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		a.accept();

}

}
