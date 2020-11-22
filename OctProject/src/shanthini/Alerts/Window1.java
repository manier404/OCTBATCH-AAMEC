package shanthini.Alerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Downloads\\selenium class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println("Title is : " + s1);
		String s2 = driver.getCurrentUrl();
		System.out.println("URL is :" + s2);
		driver.findElement(By.xpath("//input[@class='SearchBox__input']")).sendKeys("celling fan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='headerSearchButton']")).click();
		driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]")).click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		for(String childwindow : aw) {
			if(!parentWindow.equals( childwindow)) {
				driver.switchTo().window( childwindow);
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='kpf__name'])[6]")).click();

	}

}
