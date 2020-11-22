package citi.webtabe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaviya Sri\\Desktop\\OCTBATCH\\OctProject\\Driver\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("(//button[@class='btn btn-danger'])"));
		element.click();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		

	}

}
