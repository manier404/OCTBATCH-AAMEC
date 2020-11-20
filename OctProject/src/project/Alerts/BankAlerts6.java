package project.Alerts;
//Enter the userId,click continue.Enter password.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankAlerts6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\java class\\MyRepository\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://retail.onlinesbi.com/retail/login.htm");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    driver.findElement(By.className("login_button")).click();
	    driver.findElement(By.id("Button2")).click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();

	}

}
