import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Realme\\Music\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get( " https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		 Thread.sleep(2000);
		 driver.findElement( By.xpath( "//button[text()='Try it']")).click();
		 
		 driver.switchTo().frame( "iframeResult");

	}

}
