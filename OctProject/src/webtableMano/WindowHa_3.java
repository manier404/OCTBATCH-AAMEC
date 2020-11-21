package webtableMano;

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

public class WindowHa_3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("headerSearch")).sendKeys("celing fan");
		driver.findElement(By.xpath("//button[@id='headerSearchButton']")).click();
		
		WebElement celingfan = driver.findElement(By.xpath("(//img[@class='stretchy'])[6]"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", celingfan);
		js.executeScript("arguments[0].click()", celingfan);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> Allwindow = driver.getWindowHandles();
		for (String currentWindow : Allwindow) {
			if (!parentWindow.equals(currentWindow)) {
				driver.switchTo().window(currentWindow);
			}
		}
		Thread.sleep(8000);
		TakesScreenshot tk =(TakesScreenshot)driver;
		File sour =tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Manoj\\Desktop\\screenshot.bmp");
		FileUtils.copyFile(sour, des);
		
		
		
	}

}
