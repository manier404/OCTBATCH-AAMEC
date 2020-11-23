package sudarsana;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KV\\workspace\\sana\\driver\\chromedriver.exe");
		// Launch a browser
		WebDriver driver = new ChromeDriver();
		// url address bar url print console title print url
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");// url print console
		driver.manage().window().maximize();
	WebElement cancel=driver.findElement(By.xpath("//input[@class='btn btn-default']"));
	cancel.click();
	
		Alert act = driver.switchTo().alert();
		act.accept();
	}
}
