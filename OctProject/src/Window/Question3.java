package Window;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asifm\\git\\repository\\New\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.homedepot.com/");
		w.manage().window().maximize();
		String title = w.getTitle();
		System.out.println("Title of the page: " + title);
		String currentUrl = w.getCurrentUrl();
		System.out.println("CurrentUrl: " + currentUrl);
		w.findElement(By.xpath("//input[@class='SearchBox__input']")).sendKeys("celling fan");
		Thread.sleep(1000);
		w.findElement(By.xpath("//button[@id='headerSearchButton']")).click();
		w.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]")).click();
		String pw = w.getWindowHandle();
		Set<String> aw = w.getWindowHandles();
		for(String cw : aw) {
			if(!pw.equals(cw)) {
				w.switchTo().window(cw);
			}
		}
		Thread.sleep(1000);
		w.findElement(By.xpath("(//div[@class='kpf__name'])[6]")).click();
	}
}
