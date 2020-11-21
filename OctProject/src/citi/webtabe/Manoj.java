package citi.webtabe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manoj {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.aspw");
		
		
		List<WebElement> tableElements = driver.findElements(By.tagName("tr"));
	    for (int i = 10; i < tableElements.size(); i++) {
	    	if(i%2 != 0) {
	    	WebElement Element = tableElements.get(i);
	    	String textOfElements = Element.getText();
	    	System.out.println("\n"+textOfElements);
	    
		// driver.manage().window().maximize();
		/* List<WebElement> tableElements = driver.findElements(By.tagName("tr"));
		    for (int i = 10; i < tableElements.size(); i++) {
		    	WebElement Element = tableElements.get(i);
		    	String textOfElements = Element.getText();
		    	System.out.println("\n"+textOfElements);
		    */
	/*	List<WebElement> findElements = driver.findElements(By.tagName("tr"));
		 WebElement getElements = findElements.get(1);
		    System.out.println("Elements in first row: "+getElements.getText());*/
		    
	// 3rd
		//int size = path.size();
   //  2nd
		/*WebElement findElement = driver.findElement(By.xpath("//td[text()='first cell']"));
		String text = findElement.getText();
		System.out.println(text);
		WebElement findElement1 = driver.findElement(By.xpath("//td[text()='third cell']"));
		String text2 = findElement1.getText();
		System.out.println(text2);*/

	}

	}}}
