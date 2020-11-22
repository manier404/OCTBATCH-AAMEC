package shanthini.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println("Title is : " + s1);
		String s2 = driver.getCurrentUrl();
		System.out.println("URL is :" + s2);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	    Alert alert3 = driver.switchTo().alert();
	    alert3.sendKeys("Shanthini");
	    alert3.accept();
		

	}

}
