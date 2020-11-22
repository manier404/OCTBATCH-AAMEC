package webtableMano;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHa_4 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']")).sendKeys("hand sanitizer");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		WebElement findElement = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", findElement);
		js.executeScript("arguments[0].click()", findElement);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		for (String currentWi : child) {
			if (!parent.equals(currentWi)) {
				driver.switchTo().window(currentWi);
			}
		}
		
		driver.findElement(By.xpath("(//div[@title='ADD TO CART'])[1]")).click();
	}

}
