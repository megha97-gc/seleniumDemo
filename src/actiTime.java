import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcating
		driver.manage().window().maximize();// method chaining
		driver.get("https://demo.actitime.com/login.do");// load url
		String title = driver.getTitle();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");

	}
}
