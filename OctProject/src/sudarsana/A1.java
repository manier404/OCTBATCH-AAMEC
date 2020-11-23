package sudarsana;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KV\\workspace\\sana\\driver\\chromedriver.exe");
		// Launch a browser
		WebDriver driver = new ChromeDriver();
		// url address bar url print console title print url
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		// url print console
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
	WebElement c=driver.findElement(By.xpath("//img[@id='user-id-goahead']"));
	c.click();
	WebElement c1=driver.findElement(By.xpath("//input[@name='DUMMY1']"));
	c1.sendKeys("2124");
	WebElement c3=driver.findElement(By.xpath("//input[@name='Action.VALIDATE_CREDENTIALS']"));
	c3.click();
		Alert act = driver.switchTo().alert();
		act.accept();

	}
}