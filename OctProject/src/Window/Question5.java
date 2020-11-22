package Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {

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
		w.findElement(By.xpath("(//input[@type='text'])")).sendKeys("redmi phone");
		Thread.sleep(1000);
		w.findElement(By.xpath("(//button[@class='L0Z3Pu'])")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])")).click();
		String pw = w.getWindowHandle();
		Set<String> aw = w.getWindowHandles();
		for (String nw : aw) {
			if (!pw.equals(nw)) {
				w.switchTo().window(nw);
			}
		}
		Thread.sleep(2000);
		w.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(3000);
		WebElement we = w.findElement(By.xpath("(//div[@class='Ob17DV'])[3]"));
		String a = we.getText();
		System.out.println("********************************************************");
		System.out.println(a);
	}
}
