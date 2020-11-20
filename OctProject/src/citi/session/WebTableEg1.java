package citi.session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEg1 {

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
        	WebElement Row = tRows.get(i);
        	textRow=Row.getText();
        	System.out.println("Rows :"+textRow);
		}
        List<WebElement> tData = drive.findElements(By.tagName("td"));
        for (int j = 0; j < tData.size(); j++) {
        	WebElement Data = tData.get(j);
        	textData = Data.getText();
        	System.out.println("Datas :"+textData);
        	
			
		}
	}

}
