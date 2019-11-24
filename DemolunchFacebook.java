import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemolunchFacebook
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcating
		driver.manage().window().maximize();//method chaining
	  driver.navigate().to("https://www.facebook.com/");//load url
	  //findelements
	WebElement email  =driver.findElement(By.id("email"));
	email.sendKeys(" megha");//email
	WebElement pas  =driver.findElement(By.id("pass"));
	pas.sendKeys("gc");//password
	WebElement log=driver.findElement(By.id(" loginbutton"));
	log.click();
		
		

}
}
