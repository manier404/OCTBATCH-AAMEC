package Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asifm\\git\\repository\\New\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://netbanking.hdfcbank.com/netbanking/");
		w.manage().window().maximize();
		String title = w.getTitle();
		System.out.println("Title of the page: " + title);
		String currentUrl = w.getCurrentUrl();
		System.out.println("CurrentUrl: " + currentUrl);
		Thread.sleep(1000);
		w.switchTo().frame(0);
		w.findElement(By.xpath("(//input[@name='fldLoginUserId'])[1]")).sendKeys("MDAsif");
		Thread.sleep(1000);
		w.findElement(By.xpath("//img[@alt='continue']")).click();
		Thread.sleep(1000);
		w.findElement(By.xpath("//img[@alt='Login']")).click();
		Alert a = w.switchTo().alert();
		a.accept();
	}

}
