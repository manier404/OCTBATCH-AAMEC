package vasanth.windowshanding;


import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		char control;
		Scanner input=new Scanner(System.in);
		Actions act=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		try {
			driver.get("https://www.flipkart.com/ ");
			driver.manage().window().maximize();
			 driver.findElement(By.xpath("//input[@name='q']")).sendKeys(" mask ");
			 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))	.click();
			 driver.findElement(By.xpath("//button[@class='L0Z3Pu']"))	.click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[2]")).click();
			 String parenturl = driver.getWindowHandle();
			 Set<String> currenturl = driver.getWindowHandles();
			for (String x : currenturl) {
				if (!x.equals(parenturl)) {
					driver.switchTo().window(x);
				}
			}
			WebElement print = driver.findElement(By.xpath("//input[@class='_36yFo0']"));
			print.sendKeys("612502");
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

