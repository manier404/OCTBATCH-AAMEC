package project.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\java class\\MyRepository\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);

	    driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	    Alert alertObj3 = driver.switchTo().alert();
	    alertObj3.sendKeys("Ramesh");
	    alertObj3.accept();

	}

}
