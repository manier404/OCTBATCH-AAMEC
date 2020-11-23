package sudarsana;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KV\\workspace\\sana\\driver\\chromedriver.exe");
		// Launch a browser
		WebDriver driver = new ChromeDriver();
		// url address bar url print console title print url
		driver.get("http://demo.automationtesting.in/Alerts.html");// url print console
		driver.manage().window().maximize();
	WebElement cancel=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	cancel.click();
	WebElement c=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	c.click();
		Alert act = driver.switchTo().alert();
		act.dismiss();
	}}

