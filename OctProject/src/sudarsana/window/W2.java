package window;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class W2 {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KV\\workspace\\sana\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("hp laptop");

		driver.findElement(By.xpath("(//button[@class='L0Z3Pu'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		Thread.sleep(1000);
		String parentclass = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		for (String child : aw) {
			if (!parentclass.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
}}
