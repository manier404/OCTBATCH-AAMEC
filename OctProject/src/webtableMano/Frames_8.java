package webtableMano;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@title='arrow'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("mano");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("5454525");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='Submit'])[1]")).click();

	}

}
