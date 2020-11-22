package Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asifm\\git\\repository\\New\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.snapdeal.com/");
		w.manage().window().maximize();
		String title = w.getTitle();
		System.out.println("Title of the page: " + title);
		String currentUrl = w.getCurrentUrl();
		System.out.println("CurrentUrl: " + currentUrl);
		w.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("hand sanitizer");
		Thread.sleep(1000);
		w.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		w.findElement(By.xpath("(//p[contains(text(),'QHI PURE+ ADVANCE HAND SANITIZER- ALOEVERA & TULSI COMBO 5L +.5L Hand Sanitizer 5500 mL Pack of 1')])[1]")).click();
		String pw = w.getWindowHandle();
		Set<String> aw = w.getWindowHandles();
		for(String cw : aw ) {
			if(!pw.equals(cw)) {
				w.switchTo().window(cw);
			}
		}
		w.findElement(By.xpath("//div[@class='btn btn-xl rippleWhite buyFMCGNow col-xs-13 btn-theme-secondary']")).click();
	}
}
