import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassRightClick {

	
	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Realme\\Music\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get( "http://www.javatpoint.com");
		 
		WebElement text=driver.findElement(By.xpath("//a[text()='HTML']"));
		
		
		Actions actions=new Actions(driver);
		 actions.contextClick(text).build().perform();

	}

}
