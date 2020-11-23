package citi.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample7 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\git\\repository01\\sele\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.findElement(By.xpath("//input[@class='login-input mode-select-userid']")).click();
	    driver.findElement(By.xpath("//input[@id='VALIDATE_CREDENTIALS1']")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	}


}
