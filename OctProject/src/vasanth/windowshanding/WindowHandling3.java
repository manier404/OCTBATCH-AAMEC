package vasanth.windowshanding;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		char control;
		Scanner input=new Scanner(System.in);
		Actions act=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		try {
			driver.get("https://www.homedepot.com/");
			driver.manage().window().maximize();
			 driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("celling fan");
			 driver.findElement(By.xpath("//button[@id='headerSearchButton']"))	.click();
		driver.findElement(By.xpath("(//img[@class='stretchy'])[12]")).click();
				Actions a=new Actions(driver);
			
			 String parenturl = driver.getWindowHandle();
				Set<String> currenturl = driver.getWindowHandles();
//			
			
			for (String x : currenturl) {
				if (!x.equals(parenturl)) {
					driver.switchTo().window(x);
				}
			}
			driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
			
			System.out.print("Close the  chrome :");
			control=input.next().charAt(0);
		
			if(control=='y') {
				driver.quit();
			}
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.print("Close the  chrome :");
			control=input.next().charAt(0);
		
			if(control=='y') {
				driver.quit();
			}
		}
	}
}

