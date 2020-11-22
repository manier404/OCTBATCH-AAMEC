package shanthini.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Downloads\\selenium class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println("Title is : " + s1);
		String s2 = driver.getCurrentUrl();
		System.out.println("URL is :" + s2);
		
Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@class='login-input mode-select-userid']")).click();
	    driver.findElement(By.xpath("//input[@id='VALIDATE_CREDENTIALS1']")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();

	}

}
