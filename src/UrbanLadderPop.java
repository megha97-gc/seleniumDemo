import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadderPop 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcating
		driver.manage().window().maximize();// method chaining
		driver.get("https://www.Urbanladder.com/");// load url
		Thread.sleep(1000);
		WebElement a = driver.findElement(By.xpath("//a[@data-gaaction ='popup.auth.close'] "));
		a.click();
		//WebElement Dinning=driver.findElement(By.xpath("//li[@class=\"topnav_item diningunit\"]/span[@class=\"topnav_itemname\"]"));
		//System.out.println(Dinning.getText());
	WebElement a1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		a1.sendKeys("Dinning",Keys.ENTER);
	     List<WebElement> menu=driver.findElements(By.xpath("//ul[@class='topnav bodytext']"));
	     for(WebElement name:menu)
	     {
	    	 
	    	 System.out.println(name.getText());
	     }
		
		
		

}

	
		
	}

	
	
