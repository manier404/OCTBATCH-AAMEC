package web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KV\\workspace\\Web\\driver\\chromedriver.exe");
		//Launch a browser
		WebDriver driver=new ChromeDriver();
		//url address bar url print console title print url
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//url print console
		driver.manage().window().maximize();

		List<WebElement> tElements =driver.findElements(By.tagName("tr"));
		for(int i=10;i<= tElements.size();i++){
		WebElement Element=tElements.get(i);
		String te=Element.getText();
		System.out.println("\n"+te);
		
		
}}}
