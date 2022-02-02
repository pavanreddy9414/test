import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public WebDriver driver;
	public void LaunchBrowser() {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Realme\\Music\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get( "http://www.facebook.com");
		 System.out.println("first title" +driver.getTitle());

	}

}
