import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSendKeys {

	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Realme\\Music\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get( "http://facebook.com");
		 
		WebElement googlesearchbox=driver.findElement(By.id("email"));
		googlesearchbox.sendKeys( "selinium");
		
		Actions actions=new Actions(driver);
		 actions.sendKeys(Keys.BACK_SPACE).build().perform();

	}

}
