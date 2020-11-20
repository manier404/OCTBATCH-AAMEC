package project.Alerts;
//Enter the userId,click continue.Enter password.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankAlerts7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\java class\\MyRepository\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://netbanking.hdfcbank.com/netbanking/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Thread.sleep(1000);
	    driver.switchTo().frame(0);
	    WebElement UsedIdPath = driver.findElement(By.xpath("//input[@class='input_password']"));
	    UsedIdPath.sendKeys("Ramesh");
	    
	    driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
	    driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("1234567");//Entering text in password textbox.

	}

}
