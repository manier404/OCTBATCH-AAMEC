package webtableMano;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHa_6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mask");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000);

		WebElement findElement = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[6]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", findElement);
		js.executeScript("arguments[0].click()", findElement);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		for (String current : child) {
			if (!parent.equals(current)) {
				driver.switchTo().window(current);
			}
		}
		WebElement findElement2 = driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']"));
		findElement2.sendKeys("250135");
		
	}

}
