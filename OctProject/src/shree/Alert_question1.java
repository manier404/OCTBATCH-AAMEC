package shree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_question1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Selenium\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Alerts.html");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		 Thread.sleep(500);
		 driver.switchTo().alert().accept();
		 System.out.println("sucess");
		 
		 

	}

}
