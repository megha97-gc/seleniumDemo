import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone
{

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.Bluestone.com/ ");
	WebElement a1=driver.findElement(By.id("login"));
	a1.click();
	Thread.sleep(2000);
	WebElement a2=driver.findElement(By.id("email-id"));
	a2.sendKeys("meghagc@gmail.com",Keys.ENTER);
	WebElement a3=driver.findElement(By.id("password"));
	a3.sendKeys("1234567",Keys.ENTER);
	
	
}
}
