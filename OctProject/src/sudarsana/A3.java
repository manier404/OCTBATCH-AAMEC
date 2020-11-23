package sudarsana;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KV\\workspace\\sana\\driver\\chromedriver.exe");
		// Launch a browser
		WebDriver driver = new ChromeDriver();
		// url address bar url print console title print url
		driver.get(" https://netbanking.hdfcbank.com/netbanking/");// url print console
		driver.manage().window().maximize();
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='text']"));
		pass.sendKeys("devi");

		
	WebElement con=driver.findElement(By.xpath("//img[@alt='continue']"));
	con.click();

	Alert act = driver.switchTo().alert();
	act.accept();

	
	
	}
}