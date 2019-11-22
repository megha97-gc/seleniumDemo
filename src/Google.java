import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcating
		driver.manage().window().maximize();//method chaining
	  driver.navigate().to("https://www.google.com/");//load url
	  //findelements
	WebElement q=  driver.findElement(By.name("q"));
	q.sendKeys("java");
List<WebElement> java=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
Thread.sleep(5000);
for(WebElement name:java)
{
	 
	 System.out.println(name.getText());
}
	}
}
	
	



