package citi.session;

import citi.webtabe.Alert;
import citi.webtabe.ChromeDriver;
import citi.webtabe.WebDriver;
import citi.webtabe.WebElement;

public class Alert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaviya Sri\\Desktop\\OCTBATCH\\OctProject\\Driver\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement element = driver.findElement(By.xpath("(//button[@class='btn btn-danger'])"));
		element.click();
		
		WebElement element1 = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])"));
		element1.click();
		Thread.sleep(2000);
		
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();


	}

}
