package project.Alerts;
//Click Alert with ok & cancel button and Click button to display an confirm box Perform confirm alert.

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\java class\\MyRepository\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    Alert alertObj2 = driver.switchTo().alert();
	    alertObj2.dismiss();

	}

}
