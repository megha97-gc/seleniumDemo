import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/ ");
	WebElement email=driver.findElement(By.xpath("//label[@for=\"email\"]"));
	System.out.println(email.getText());
	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(email.getText());
	WebElement password=driver.findElement(By.xpath(" //input[@type='password']"));
	System.out.println(password.getText());
	
	
	
	

}
}
