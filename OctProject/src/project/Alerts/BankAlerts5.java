package project.Alerts;
//Click sign in without enter the user id and print text appear and handle popup
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankAlerts5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\java class\\MyRepository\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    WebElement signInButton = driver.findElement(By.xpath("//input[@class='btn btn-default']"));
	    signInButton.click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();//handling alert popup
	    
	    
	    

	}

}
