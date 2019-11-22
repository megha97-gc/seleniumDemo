import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemolunchGmail
{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();//upcating
			driver.manage().window().maximize();//method chaining
		  driver.navigate().to("https://www.gmail.com/");//load url
		  //findelements
		WebElement indentifier=  driver.findElement(By.id("identifierId"));
		indentifier.sendKeys("meghagc@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		WebElement pas=  driver.findElement(By.name("password"));
		pas.sendKeys("123",Keys.ENTER);
	WebElement	ca=driver.findElement(By.id("ca"));
	ca.
		
}
}
