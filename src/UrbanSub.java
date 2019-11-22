import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanSub 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcating
		driver.manage().window().maximize();// method chaining
		driver.get("https://www.Urbanladder.com/");// load url
		Thread.sleep(1000);
		WebElement a = driver.findElement(By.xpath("//a[@data-gaaction ='popup.auth.close'] "));
		a.click();
		List<WebElement> sub=driver.findElements(By.xpath(" //span[contains(.,'Living')]/parent::li/descendant::ul[@class=\"inline-list left\"]/li[contains(.,'sofa')]"));
		 for(WebElement name:sub)
	     {
	    	 
	 	 System.out.println(name.getText());
	     }
	}
}

