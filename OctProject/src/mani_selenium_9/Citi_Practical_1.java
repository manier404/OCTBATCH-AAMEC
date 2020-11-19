package mani_selenium_9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Citi_Practical_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manikandan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("http://demo.automationtesting.in/Alerts.html");
        drive.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Alert act = drive.switchTo().alert();
        act.accept();
	}

}
