import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch2
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcating
		driver.manage().window().maximize();//method chaining
	  driver.get("https://www.flipkart.com/");//load url
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.Myntra.com/");
		Thread.sleep(2000);
		driver.get("https://www.Jabong.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.clubfactory.com/");
		Thread.sleep(2000);
		driver.close();
		

}
}
