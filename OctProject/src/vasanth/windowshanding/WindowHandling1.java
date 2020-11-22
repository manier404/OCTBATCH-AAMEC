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

public class WindowHandling1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		char control;
		Scanner input=new Scanner(System.in);
		Actions act=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		try {
			driver.get("https://www.amazon.com");

			driver.manage().window().maximize();
			 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphones X");
			 driver.findElement(By.xpath("(//input[@class='nav-input'])[2]"))	.click();
		WebElement s = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
				Actions a=new Actions(driver);
			 Robot r=new Robot();
			 
			a.contextClick(s).perform();
			
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(5000);
			String parenturl = driver.getWindowHandle();
			Set<String> currenturl = driver.getWindowHandles();
			for (String x : currenturl) {
				if (!x.equals(parenturl)) {
					driver.switchTo().window(x);
				}
			}
			WebElement price = driver.findElement(By.xpath("//div[@id='availability']"));
			System.out.println("Price : "+price.getText());
			System.out.print("Close the  chrome :");
			control=input.next().charAt(0);
		
			if(control=='y') {
				driver.quit();
			}
		}
		catch (Exception e) {
			WebElement price = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
			System.out.println("Price : "+price.getText());
			System.out.print("Close the  chrome :");
			control=input.next().charAt(0);
		
			if(control=='y') {
				driver.quit();
			}
		}
	}
}

