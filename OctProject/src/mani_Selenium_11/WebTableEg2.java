package mani_Selenium_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manikandan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("http://demo.guru99.com/test/write-xpath-table.html");
        String textRow=null,textData=null;
        List<WebElement> tRows = drive.findElements(By.tagName("tr"));
        for (int i = 0; i < tRows.size(); i++) {
        	WebElement Row = tRows.get(0);
        	textRow=Row.getText();
        	System.out.println("Rows :"+textRow);
	}

}
}
