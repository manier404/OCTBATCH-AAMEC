package shanthini.Alerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Downloads\\selenium class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println("Title is : " + s1);
		String s2 = driver.getCurrentUrl();
		System.out.println("URL is :" + s2);
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("hp laptop");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='L0Z3Pu'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		String parent = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		for (String child : aw) {
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	

	}

}
