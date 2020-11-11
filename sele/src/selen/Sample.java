package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\java\\sele\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kaviyasri");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("531527");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		WebElement element1 = driver.findElement(By.xpath("//select[@name='location']"));
		Select location1 = new Select(element1);
		location1.selectByIndex(6);
		WebElement element2 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select hotel = new Select(element2);
		hotel.selectByValue("Hotel Sunshine");
		WebElement element3 = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select roomtype = new Select(element3);
		roomtype.selectByIndex(4);
		WebElement element4 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select roomno = new Select(element4);
		roomno.selectByIndex(1);
		WebElement element5 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select adultperRoom = new Select(element5);
		adultperRoom.selectByIndex(2);
		WebElement element6 = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select childrenperRoom = new Select(element6);
		childrenperRoom.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Balakumar");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Sivamani");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("165 N Hoover St ");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567812345678");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567812345678");
		WebElement element7 = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select creditcardType = new Select(element7);
		creditcardType.selectByIndex(3);
		WebElement element8 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select expiryMonth = new Select(element8);
		expiryMonth.selectByIndex(3);
		WebElement element9 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select expiryYear = new Select(element9);
		expiryYear.selectByIndex(11);
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//input[@name='order_no']")).getAttribute("value");
		System.out.println("order no : "+text);
	}
				
}
	
		
		

