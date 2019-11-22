import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement search=driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"] "));
search.sendKeys("shirt",Keys.ENTER);
WebElement shirt=driver.findElement(By.xpath("//img[@class='img-responsive']"));
shirt.click();
	}
}
