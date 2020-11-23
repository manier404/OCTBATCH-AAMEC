package web;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class S1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KV\\workspace\\Web\\driver\\chromedriver.exe");
		//Launch a browser
		WebDriver driver=new ChromeDriver();
		//url address bar url print console title print url
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		//url print console
		driver.manage().window().maximize();
		String textRow=null,textData=null;
		List<WebElement> tRows =driver.findElements(By.tagName("tr"));
		for(int i=0;i<= tRows.size();i++){
		WebElement row=tRows.get(0);
		textRow=row.getText();
		System.out.println("row:"+textRow);
		List<WebElement> tdata =driver.findElements(By.tagName("td"));
		for(int j=0;j<tdata.size();j++){
		WebElement data=tdata.get(0);
		textData=data.getText();
		System.out.println("data:"+textData);
		
				}
		}
}}
