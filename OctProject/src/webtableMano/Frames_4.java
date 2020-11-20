package webtableMano;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		findElement.sendKeys("4454545");
		driver.findElement(By.xpath("//img[@style='margin-right:18px;']")).click();
		driver.findElement(By.xpath("(//img[@alt='Login'])")).click();
		driver.switchTo().alert().accept();
	}

}
