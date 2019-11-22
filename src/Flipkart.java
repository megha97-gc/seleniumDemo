import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart
{

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/ ");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement close=driver.findElement(By.xpath(" //button[@class=\"_2AkmmA _29YdH8\"]"));//close popup
	close.click();
	//List<WebElement> menu=driver.findElements(By.xpath("//ul[@class=\"_114Zhd\"] "));
 //for(WebElement name:menu)
     {
    	 
 //	 System.out.println(name.getText());
    	// WebElement close=driver.findElement(By.xpath(" ")
     }
}
}
