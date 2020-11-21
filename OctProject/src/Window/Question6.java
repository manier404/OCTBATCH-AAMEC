package Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asifm\\git\\repository\\New\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.flipkart.com/");
		w.manage().window().maximize();
		String title = w.getTitle();
		System.out.println("Title of the page: " + title);
		String currentUrl = w.getCurrentUrl();
		System.out.println("CurrentUrl: " + currentUrl);
		Thread.sleep(1000);
		w.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		w.findElement(By.xpath("(//input[@type='text'])")).sendKeys("mask");
		Thread.sleep(2000);
		w.findElement(By.xpath("(//button[@class='L0Z3Pu'])")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[@class='s1Q9rs']")).click();
		Thread.sleep(2000);
		String pw = w.getWindowHandle();
		Set<String> aw = w.getWindowHandles();
		for (String nw : aw) {
			if (!pw.equals(nw)) {
				w.switchTo().window(nw);
			}
		}
		Thread.sleep(1000);
		w.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("614401");
		w.findElement(By.xpath("(//span[@class='_2P_LDn'])")).click();
	}

}
