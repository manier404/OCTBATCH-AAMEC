package webtableMano;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHa_2 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']")).sendKeys("iphones 7");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Actions Act = new Actions(driver);
		WebElement Rightcli = driver.findElement(By.xpath("//p[@title='Apple iPhone 7 Plus Cases with Stands Shining Stars - Black']"));
		Act.contextClick(Rightcli).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> AllWindow = driver.getWindowHandles();
		for (String currentWindow : AllWindow) {
			if (!parentWindow.equals(currentWindow)) {
				driver.switchTo().window(currentWindow);
			}
		}
		
		driver.findElement(By.id("add-cart-button-id")).click();
		WebElement print = driver.findElement(By.xpath("//div[@class='you-pay']"));
		String text = print.getText();
		System.out.println(text);
	}

}
