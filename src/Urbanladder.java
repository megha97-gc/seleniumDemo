import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcating
		driver.manage().window().maximize();// method chaining
		driver.get("https://www.Urbanladder.com/");// load url
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.id(" spree_user_email"));
		a.sendKeys("megha", Keys.ENTER);

	}
}
