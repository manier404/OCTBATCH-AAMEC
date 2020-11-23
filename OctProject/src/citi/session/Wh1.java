package citi.session;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaviya Sri\\Desktop\\OCTBATCH\\OctProject\\Driver\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("redmi");
		driver.findElement(By.xpath("(//div[@class='CXW8mj'])[1]")).click();
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String current : handles) {
			if(!parent.equals(current)) {
				driver.switchTo().window(current);
			}
		}
		WebElement element = driver.findElement(By.xpath("(//div[@class='_30jeq3 _16Jk6d'])"));
		String text= element.getText();
		System.out.println(text);
		
	}

}
