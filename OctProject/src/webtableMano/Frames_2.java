package webtableMano;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement findElement = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		findElement.click();
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
