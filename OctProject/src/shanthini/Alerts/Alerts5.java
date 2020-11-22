package shanthini.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Downloads\\selenium class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println("Title is : " + s1);
		String s2 = driver.getCurrentUrl();
		System.out.println("URL is :" + s2);
		
		driver.findElement(By.className("login_button")).click();
	    driver.findElement(By.id("Button2")).click();
	    
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();


	}

}
