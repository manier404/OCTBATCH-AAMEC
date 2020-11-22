package shanthini.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Downloads\\selenium class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println("Title is : " + s1);
		String s2 = driver.getCurrentUrl();
		System.out.println("URL is :" + s2);

		
		 Thread.sleep(1000);
		    driver.switchTo().frame(0);
		    WebElement UsedId = driver.findElement(By.xpath("//input[@class='input_password']"));
		    UsedId.sendKeys("Shanthini");
		    
		    driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		    driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("123456789");
	}

	}


