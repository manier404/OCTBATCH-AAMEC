package windowHandlingMano;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHa_1 {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones X");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(2000);
		WebElement firstPh = driver
				.findElement(By.xpath("//span[text()='Simple Mobile Prepaid - Apple iPhone XS Max (64GB) - Silver']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);

		act.contextClick(firstPh).perform();

		Robot r = new Robot();
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(5000);

		Set<String> child = driver.getWindowHandles();
		for (String currentwinndow : child) {
			if (!parent.equals(currentwinndow)) {
				driver.switchTo().window(currentwinndow);
			}
		}
		Thread.sleep(6000);

		driver.findElement(By.xpath("//a[@title='Add to List']")).click();

		Thread.sleep(2000);

		TakesScreenshot tk = (TakesScreenshot) driver;
		File sorc = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Manoj\\Desktop\\tablehandling.bmp");
		FileUtils.copyFile(sorc, des);

	}

}
