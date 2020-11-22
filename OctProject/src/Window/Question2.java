package Window;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {

	public static void main(String[] args) throws  InterruptedException {
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
		w.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("iphones 7");
		Thread.sleep(1000);
		w.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		w.findElement(By.xpath("(//p[contains(text(),'Apple iPhone 7 Plus Plain Cases Coverage - Blue')])[1]")).click();
		String pw = w.getWindowHandle();
		Set<String> aw = w.getWindowHandles();
		for(String cw : aw ) {
			if(!pw.equals(cw)) {
				w.switchTo().window(cw);
			}
		}
		w.findElement(By.xpath("(//span[@class='intialtext'])[2]")).click();
		WebElement we = w.findElement(By.xpath("//div[@class='you-pay']"));
		String s = we.getText();
		System.out.println("********************************************************");
		System.out.println(s);
	}

}
