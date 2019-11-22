import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleImage
{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcating
		driver.manage().window().maximize();//method chaining
	  driver.navigate().to("https://www.google.com/");//load url
	  //findelements
	WebElement q=  driver.findElement(By.name("q"));
	q.sendKeys("java",Keys.ENTER);
	Thread.sleep(2000);
//	WebElement q1=driver.findElement(By.name("q"));
	//q1.clear();
	WebElement image=  driver.findElement(By.xpath("//a[contains(.,'Images')]"));
	image.click();
	Thread.sleep(1000);
	WebElement image1 = driver.findElement(By.id("rT8rqQKh8jt3DM"));
	image1.click();
	

}
}