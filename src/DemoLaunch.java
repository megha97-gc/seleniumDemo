import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcating
		driver.manage().window().maximize();//method chaining
		//driver.get("https://www.facebook.com/");//load url
		//driver.navigate().to("https://www.facebook.com/");
		//driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://www.naukri.com/");//load url
	   String title=driver.getTitle();
	   System.out.println(title);
	   System.out.println(driver.getCurrentUrl());

		String parent=	driver.getWindowHandle();
		System.out.println(parent+"p");
	
	
	Thread.sleep(20000);
	Set<String> wins=driver.getWindowHandles();
	/*Thread.sleep(2000);
//	wins.remove(parent);
	for(String win:wins)
	{
		System.out.println(win+"c");
		Thread.sleep(2000);
		driver.switchTo().window(win).close();
		
		
	}
	
	
			}
			}
*/
//reverse
ArrayList<String> lst= new ArrayList<>(wins);
//lst.addAll(wins);
for(int i=lst.size()-1;i>=0;i--)
driver.switchTo().window(lst.get(i)).close();
}
}

		
		// Thread.sleep(2000);
	     //driver.navigate().back();
	    // Thread.sleep(2000);
	  //   driver.navigate().forward();
	  //   Thread.sleep(2000);
	   //  driver.navigate().refresh();
	
