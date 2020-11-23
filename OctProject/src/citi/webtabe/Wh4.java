package citi.webtabe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wh4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaviya Sri\\Desktop\\OCTBATCH\\OctProject\\Driver\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='col-xs-20 searchformInput keyword'])")).sendKeys("hand sanitizer");
		driver.findElement(By.xpath("(//img[@class='product-image '])")).click();
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String current : handles) {
			if(!parent.equals(current)) {
				driver.switchTo().window(current);
			}
		}
		WebElement element = driver.findElement(By.xpath("(//div[@class='btn btn-xl rippleWhite buyFMCGNow col-xs-13 btn-theme-secondary'])[1]"));
		String text= element.getText();
		System.out.println(text);
	}

}
