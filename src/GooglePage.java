import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {
		
		public static void main(String[] args)  {
			System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Realme\\Music\\chromedriver_win32\\chromedriver.exe");
			
			 WebDriver driver=new ChromeDriver();
	 		 driver.manage().window().maximize();
			 driver.navigate().to( " https://www.facebook.com");
			System.out.println("title of the page is"+driver.getTitle());
	
	}

}
