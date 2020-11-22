package citi.webtabe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wh6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaviya Sri\\Desktop\\OCTBATCH\\OctProject\\Driver\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='col-xs-20 searchformInput keyword'])")).sendKeys("iphones 7");
		driver.findElement(By.xpath("(//div[@class='mmm col-xs-6 btn btn-xl btn-theme-secondary rippleWhite buyLink'])")).click();
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String current : handles) {
			if(!parent.equals(current)) {
				driver.switchTo().window(current);
			}
		}
		WebElement element = driver.findElement(By.xpath("(//div[@class='you-pay'])"));
		String text= element.getText();
		System.out.println(text);


	}

}
