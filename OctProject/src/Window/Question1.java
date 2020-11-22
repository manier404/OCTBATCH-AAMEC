package Window;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asifm\\git\\repository\\New\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.amazon.com/");
		w.manage().window().maximize();
		String title = w.getTitle();
		System.out.println("Title of the page: " + title);
		String currentUrl = w.getCurrentUrl();
		System.out.println("CurrentUrl: " + currentUrl);
		Robot r = new Robot();
		Actions a = new Actions(w);
		w.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("i phones X");
		w.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		WebElement we = w.findElement(By.xpath("//img[@alt='LOFTer 360 Case Compatible with iPhone Xs Case with Tempered Glass Built in Screen Protector iPhone X Cover Transparent Cl...']"));
		Thread.sleep(1000);
		a.contextClick(we);
		a.moveToElement(we).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		String pw = w.getWindowHandle();
		Set<String> aw = w.getWindowHandles();
		for(String cw : aw ) {
			if(!pw.equals(cw)) {
				w.switchTo().window(cw);
			}
		}
		Thread.sleep(3000);
		w.findElement(By.xpath("//span[@id='contextualIngressPtLabel']")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//input[@class='GLUX_Full_Width a-declarative']")).sendKeys("614401");
		Thread.sleep(2000);
		w.findElement(By.xpath("(//input[@type='submit'])[16]")).click();
		Thread.sleep(5000);
		w.findElement(By.xpath("(//input[@type='submit'])[15]")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("(//input[@id='add-to-cart-button'])")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[@id='hlb-view-cart-announce']")).click();
		Thread.sleep(5000);
		w.findElement(By.xpath("//span[contains(text(),'$15.99')]"));
		String s =w.getTitle();
		System.out.println(s);
	}
}
