package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asifm\\git\\repository\\New\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(1000);
		w.manage().window().maximize();
		String title = w.getTitle();
		System.out.println("Title of the page: " + title);
		String currentUrl = w.getCurrentUrl();
		System.out.println("CurrentUrl: " + currentUrl);
		System.out.println("Even elements in second table : ");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		List<WebElement> o = w.findElements(By.tagName("tr"));
		for (int i = 0; i < o.size(); i++) {
			if (i >= 10) {
				if (i % 2 == 0) {
					WebElement a = o.get(i);
					String s = a.getText();
					System.out.println("Table content:" + s);
				}
			}
		}
	}
}
