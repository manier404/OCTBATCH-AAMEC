package vasanth.Table;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	char control;
	Scanner input=new Scanner(System.in);
	try {
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		List<WebElement> a = driver.findElements(By.tagName("td"));
		 
		 System.out.print("\n\nClose the  chrome :");
		control=input.next().charAt(0);
	
		if(control=='y') {
			driver.quit();
		}
	}
	catch (Exception e) {
		System.out.println(e);
		System.out.print("\n\nClose the  chrome :");
		control=input.next().charAt(0);
	
		if(control=='y') {
			driver.quit();
		}
	}
}

}

