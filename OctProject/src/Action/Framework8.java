package Action;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framework8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	char control;
	Scanner input=new Scanner(System.in);
	try {
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='DUMMY1']")).sendKeys("96007787558");
		
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