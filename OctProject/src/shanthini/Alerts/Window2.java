package shanthini.Alerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Downloads\\selenium class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println("Title is : " + s1);
		String s2 = driver.getCurrentUrl();
		System.out.println("URL is :" + s2);
		driver.findElement(By.xpath("//input[@name='keyword']")).sendKeys("hand sanitizer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		driver.findElement(By.xpath("(//p[contains(text(),'QHI PURE+ ADVANCE HAND SANITIZER- ALOEVERA & TULSI COMBO 5L +.5L Hand Sanitizer 5500 mL Pack of 1')])[1]")).click();
		String parent = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		for(String child : aw ) {
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		driver.findElement(By.xpath("//div[@class='btn btn-xl rippleWhite buyFMCGNow col-xs-13 btn-theme-secondary']")).click();
		
		

	}

}
