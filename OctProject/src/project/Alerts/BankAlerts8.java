package project.Alerts;
//Enter the userId Click login button
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankAlerts8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\java class\\MyRepository\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@class='login-input mode-select-userid']")).click();//UeserId tab
	    driver.findElement(By.xpath("//input[@id='VALIDATE_CREDENTIALS1']")).click();//Login button
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();//handling alert

	}

}
