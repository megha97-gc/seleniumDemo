import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClubfactoryMouseover
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcating
		driver.manage().window().maximize();//method chaining
	  driver.get("https://www.clubfactory.com//");//load url
		Thread.sleep(3000);
	List<WebElement> mouseover=	driver.findElements(By.xpath(" //div[@class='header_left___2zfw9E1f']/div"));
	Actions a=new Actions(driver);
	Thread.sleep(3000);
	for(WebElement name :mouseover)
	{
		System.out.println(name.getText());
		a.moveToElement(name).perform();
		Thread.sleep(1000);
	}

}
}