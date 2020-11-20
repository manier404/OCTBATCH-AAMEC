package Action;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framework7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	char control;
	Scanner input=new Scanner(System.in);
	try {
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("96007787558");
		driver.findElement(By.xpath("//a[@onclick='return fLogon();']")).click();
		driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("ghhgvghfhgvgh");
		driver.findElement(By.xpath("//a[@onclick='return fLogon();']")).click();
		
		System.out.print("\n\nClose the  chrome :");
		control=input.next().charAt(0);
	
		if(control=='y') {
			driver.quit();
		}
	}
	catch (Exception e) {
		System.out.println(e);
		System.out.print("\n\nClose the  chrome :");
		control=input.next().charAt(0);
	
		if(control=='y') {
			driver.quit();
		}
	}
}
}