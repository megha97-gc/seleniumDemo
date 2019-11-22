import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcating
		driver.manage().window().maximize();//method chaining
	  driver.navigate().to("https://www.google.com/");//load url
	  //findelements
	WebElement q=  driver.findElement(By.name("q"));
	q.sendKeys("java",Keys.ENTER);
	//WebElement btnk=driver.findElement(By.name("btnK"));
	//btnk.click();
	Thread.sleep(2000);
	WebElement q1=driver.findElement(By.name("q"));
	q1.clear();
	Thread.sleep(2000);
	WebElement q2=driver.findElement(By.name("q"));
	q2.sendKeys("selenium",Keys.ENTER);
	Thread.sleep(2000);
	//q2.click();
	driver.navigate().back();//back to previus page
	
	
	
	

}
}
