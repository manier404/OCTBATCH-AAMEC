package citi.webtabe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wh5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaviya Sri\\Desktop\\OCTBATCH\\OctProject\\Driver\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='SearchBox__input'])")).sendKeys("ceiling fan");
		driver.findElement(By.xpath("(//img[@class='stretchy'])[1]")).click();
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String current : handles) {
			if(!parent.equals(current)) {
				driver.switchTo().window(current);
			}
		}
		WebElement element = driver.findElement(By.xpath("(//li[@class='list__item'])[2]"));
		String text= element.getText();
		System.out.println(text);

	}

}
