package citi.session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4Shanthini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Downloads\\selenium class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println("Title is : " + s1);
		String s2 = driver.getCurrentUrl();
		System.out.println("URL is :" + s2);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		for (int i =10; i <=rows.size(); i++) {
			if(i%2 !=0) {
				WebElement e =  rows.get(i);
				String txtElement = e.getText();
				System.out.println("\n" + txtElement);


	}

}
	}
}
